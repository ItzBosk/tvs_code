asm updateinc

import StandardLibrary

signature:
	domain MyNumber subsetof Integer
	controlled c_var : MyNumber
	monitored m_var: MyNumber
	
definitions:
	domain MyNumber = {1: 10}
	
	main rule r_main =
//		choose $m in MyNumber with true do   
//		par
//			c_var := $m
//			c_var := 7
//		endpar
//		if m_var > 2 then
//			if m_var < 2 then
//				c_var := 9
//			endif
//		endif	
//			if c_var = 7 then c_var := 7 endif
         par
         	c_var := m_var
         	if m_var = 1 then c_var := 8 endif
         endpar
 	
default init s0:
	function c_var = 0
	
	