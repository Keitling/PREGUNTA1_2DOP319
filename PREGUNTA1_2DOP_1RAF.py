# -*- coding: utf-8 -*-
"""
Created on Fri Jun 10 17:08:12 2022

@author: Keitling Salinas
"""

from math import sqrt
def F(n):
    return ((1+sqrt(5))**n-(1-sqrt(5))**n)/(2**n*sqrt(5))

def Fibonacci(startNumber, endNumber):
    n = 0
    cur = F(n)
    while cur <= endNumber:
        if startNumber <= cur:
            print(cur)
        n += 1
        cur = F(n)
Fibonacci(1,100)
