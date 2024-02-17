asm invariant_use

import StandardLibrary

signature:
	domain MyNumber subsetof Integer
	controlled c_var : MyNumber
	monitored m_var: MyNumber
	
definitions:
	domain MyNumber = {1: 10}

//invarianti
	// esempio la variabile controllata non è mai 7
	invariant inv_1 over c_var: c_var != 7 

	main rule r_main =  c_var := m_var
 	
default init s0:
	function c_var = 0
	
	