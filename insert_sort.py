#!/usr/bin/env python3

import random
import sys

def insert_sort(seq):
    print("-- Insertion Sort --")
    N = len(seq)
    print(seq)
    for i in range(1, N):
        x = seq[i]
        j = i - 1
        while j >= 0 and seq[j] > x:
            seq[j+1] = seq[j]
            j -= 1
            print(seq)
        seq[j+1] = x
        print(seq)

if __name__ == "__main__":
    A = [[random.randint(-sys.maxsize, sys.maxsize+1) for _ in range(5)] for _ in range(3)]
    for x in A:
        insert_sort(x)
