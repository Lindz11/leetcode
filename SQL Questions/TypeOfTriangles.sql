select 
    case 
        when A + B <= C or A + C <= B or B + C <= A then 'Not A Triangle'
        when A = B and B = C then 'Equilateral'
        when A = B or B = C  or A = C then ' Isosceles'
        when A <> B and B <> C then 'Scalene' 
    end 
from triangles 
/*
 The order matters for this question and you need to make sure u have not triangle as the base case and check in the same way it was described
*/
