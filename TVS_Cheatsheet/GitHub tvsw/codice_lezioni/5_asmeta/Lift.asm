asm Lift

import StandardLibrary

signature:

abstract domain Lift
// ogni liff ha una sua direzione
enum domain Direction = {UP, DOWN}
dynamic controlled direction: Lift -> Direction 


definitions:

