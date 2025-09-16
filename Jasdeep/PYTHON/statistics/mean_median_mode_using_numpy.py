import numpy as np
from scipy import stats

data = np.array([2, 4, 7, 7, 9, 10, 13, 13, 13, 16, 18])

mean = np.mean(data)
median = np.median(data)
mode = stats.mode(data).mode.item()

print("Mean:", mean)
print("Median:", median)
print("Mode:", mode)
