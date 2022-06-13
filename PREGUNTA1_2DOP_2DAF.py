# -*- coding: utf-8 -*-
"""
Created on Fri Jun 10 17:13:22 2022

@author: Keitling Salinas
"""

def fibonacci_iter(n):
    a=1
    b=1
    if n==1:
        print('0')
    elif n==2:
        print('0','1')
    else:
        print('0')
        print(a)
        print(b)
        for i in range(n-3):
            total = a + b
            b=a
            a= total
            print(total)
         
fibonacci_iter(8)
