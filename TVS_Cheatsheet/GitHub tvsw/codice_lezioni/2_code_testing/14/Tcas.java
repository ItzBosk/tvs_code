public class Tcas {

	/* -*- Last-Edit: Fri Jan 29 11:13:27 1993 by Tarak S. Goradia; -*- */
	/*
	 * $Log: tcas.c,v $ Revision 1.2 1993/03/12 19:29:50 foster Correct logic
	 * bug which didn't allow output of 2 - hf
	 */

	public static final int OLEV = 600; /* in feets/minute */
	public static final int MAXALTDIFF = 600; /* max altitude difference in feet */
	public static final int MINSEP = 300; /* min separation in feet */
	public static final int NOZCROSS = 100; /* in feet */

	public static int Cur_Vertical_Sep;
	public static boolean High_Confidence;
	public static boolean Two_of_Three_Reports_Valid;

	public static int Own_Tracked_Alt;
	public static int Own_Tracked_Alt_Rate;
	public static int Other_Tracked_Alt;

	public static int Alt_Layer_Value; /* 0, 1, 2, 3 */
	public static int Positive_RA_Alt_Thresh[] = new int[4];

	public static int Up_Separation;
	public static int Down_Separation;

	/* state variables */
	public static int Other_RAC; /* NO_INTENT, DO_NOT_CLIMB, DO_NOT_DESCEND */
	public static final int NO_INTENT = 0;
	public static final int DO_NOT_CLIMB = 1;
	public static final int DO_NOT_DESCEND = 2;

	public static int Other_Capability; /* TCAS_TA, OTHER */
	public static final int TCAS_TA = 1;
	public static final int OTHER = 2;

	public static int Climb_Inhibit; /* true/false */

	public static final int UNRESOLVED = 0;
	public static final int UPWARD_RA = 1;
	public static final int DOWNWARD_RA = 2;

	public static void initialize() {
		Positive_RA_Alt_Thresh[0] = 400;
		Positive_RA_Alt_Thresh[1] = 500;
		Positive_RA_Alt_Thresh[2] = 640;
		Positive_RA_Alt_Thresh[3] = 740;
	}

	public static int ALIM() {
		return Positive_RA_Alt_Thresh[Alt_Layer_Value];
	}

	public static int Inhibit_Biased_Climb() {
		return (Climb_Inhibit != 0 ? Up_Separation + NOZCROSS : Up_Separation);
	}

	public static boolean Non_Crossing_Biased_Climb() {
		int upward_preferred;
		int upward_crossing_situation;
		boolean result;

		upward_preferred = (Inhibit_Biased_Climb() > Down_Separation) ? 1 : 0;
		if (upward_preferred != 0) {
			result = !(Own_Below_Threat())
					|| ((Own_Below_Threat()) && (!(Down_Separation >= ALIM())));
		} else {
			result = Own_Above_Threat() && (Cur_Vertical_Sep >= MINSEP)
					&& (Up_Separation >= ALIM());
		}
		return result;
	}

	public static boolean Non_Crossing_Biased_Descend() {
		int upward_preferred;
		int upward_crossing_situation;
		boolean result;

		upward_preferred = (Inhibit_Biased_Climb() > Down_Separation) ? 1 : 0;
		if (upward_preferred != 0) {
			result = Own_Below_Threat() && (Cur_Vertical_Sep >= MINSEP)
					&& (Down_Separation >= ALIM());
		} else {
			result = !(Own_Above_Threat())
					|| ((Own_Above_Threat()) && (Up_Separation >= ALIM()));
		}
		return result;
	}

	public static boolean Own_Below_Threat() {
		return (Own_Tracked_Alt < Other_Tracked_Alt);
	}

	public static boolean Own_Above_Threat() {
		return (Other_Tracked_Alt < Own_Tracked_Alt);
	}

	public static int alt_sep_test() {
		boolean enabled, tcas_equipped, intent_not_known;
		boolean need_upward_RA, need_downward_RA;
		int alt_sep;

		enabled = High_Confidence && (Own_Tracked_Alt_Rate <= OLEV)
				&& (Cur_Vertical_Sep > MAXALTDIFF);
		tcas_equipped = Other_Capability == TCAS_TA;
		intent_not_known = Two_of_Three_Reports_Valid && Other_RAC == NO_INTENT;

		alt_sep = UNRESOLVED;

		if (enabled && ((tcas_equipped && intent_not_known) || !tcas_equipped)) {
			need_upward_RA = Non_Crossing_Biased_Climb() && Own_Below_Threat();
			need_downward_RA = Non_Crossing_Biased_Descend()
					&& Own_Above_Threat();
			if (need_upward_RA && need_downward_RA)
				/*
				 * unreachable: requires Own_Below_Threat and Own_Above_Threat
				 * to both be true - that requires Own_Tracked_Alt <
				 * Other_Tracked_Alt and Other_Tracked_Alt < Own_Tracked_Alt,
				 * which isn't possible
				 */
				alt_sep = UNRESOLVED;
			else if (need_upward_RA)
				alt_sep = UPWARD_RA;
			else if (need_downward_RA)
				alt_sep = DOWNWARD_RA;
			else
				alt_sep = UNRESOLVED;
		}

		return alt_sep;
	}

	public static void main(String[] args) {
		if (args.length < 13) {
			System.out.print("Error: Command line arguments are\n");
			System.out
					.print("Cur_Vertical_Sep, High_Confidence, Two_of_Three_Reports_Valid\n");
			System.out
					.print("Own_Tracked_Alt, Own_Tracked_Alt_Rate, Other_Tracked_Alt\n");
			System.out
					.print("Alt_Layer_Value, Up_Separation, Down_Separation\n");
			System.out.print("Other_RAC, Other_Capability, Climb_Inhibit\n");
			return;
		}
		initialize();
		Cur_Vertical_Sep = Integer.parseInt(args[1]);
		High_Confidence = (Integer.parseInt(args[2]) == 0) ? false : true;
		Two_of_Three_Reports_Valid = (Integer.parseInt(args[2]) == 0) ? false
				: true;
		Own_Tracked_Alt = Integer.parseInt(args[4]);
		Own_Tracked_Alt_Rate = Integer.parseInt(args[5]);
		Other_Tracked_Alt = Integer.parseInt(args[6]);
		Alt_Layer_Value = Integer.parseInt(args[7]);
		Up_Separation = Integer.parseInt(args[8]);
		Down_Separation = Integer.parseInt(args[9]);
		Other_RAC = Integer.parseInt(args[10]);
		Other_Capability = Integer.parseInt(args[11]);
		Climb_Inhibit = Integer.parseInt(args[12]);

		System.out.print(alt_sep_test() + "\n");
		return;

	}

}
