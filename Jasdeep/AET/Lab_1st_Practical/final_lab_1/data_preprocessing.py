# ==============================
# DATA HANDLING & PREPROCESSING
# ==============================

# Import required libraries
import pandas as pd
import numpy as np
from sklearn.preprocessing import MinMaxScaler, LabelEncoder

# ------------------------------
# STEP 1: Load the Dataset
# ------------------------------
# Read CSV file into DataFrame
df = pd.read_csv("data.csv")

print("Initial Data:")
print(df)
print("\n")

# ------------------------------
# STEP 2: Explore the Dataset
# ------------------------------
# Show basic information about data
print("Dataset Info:")
print(df.info())
print("\n")

# Show statistical summary (numerical columns)
print("Summary Statistics:")
print(df.describe())
print("\n")

# ------------------------------
# STEP 3: Identify Missing Values
# ------------------------------
# Check missing values per column
print("Missing Values Count:")
print(df.isnull().sum())
print("\n")

# ------------------------------
# STEP 4: Handle Missing Values
# ------------------------------

# Fill missing Age values using mean
df['Age'].fillna(df['Age'].mean(), inplace=True)

# Fill missing Salary values using median (better for outliers)
df['Salary'].fillna(df['Salary'].median(), inplace=True)

# Fill missing City values using mode (most frequent value)
df['City'].fillna(df['City'].mode()[0], inplace=True)

print("After Handling Missing Values:")
print(df)
print("\n")

# ------------------------------
# STEP 5: Handle Outliers (IQR Method)
# ------------------------------

# Calculate Q1 (25th percentile) and Q3 (75th percentile)
Q1 = df['Salary'].quantile(0.25)
Q3 = df['Salary'].quantile(0.75)

# Interquartile Range
IQR = Q3 - Q1

# Remove rows having salary outliers
df = df[
    (df['Salary'] >= Q1 - 1.5 * IQR) &
    (df['Salary'] <= Q3 + 1.5 * IQR)
]

print("After Removing Outliers:")
print(df)
print("\n")

# ------------------------------
# STEP 6: Normalize Numerical Data
# ------------------------------

# Min-Max Scaling (0 to 1 range)
scaler = MinMaxScaler()
df[['Age', 'Salary']] = scaler.fit_transform(df[['Age', 'Salary']])

print("After Normalization:")
print(df)
print("\n")

# ------------------------------
# STEP 7: Encode Categorical Data
# ------------------------------

# Label Encoding for Gender (Male/Female)
le = LabelEncoder()
df['Gender'] = le.fit_transform(df['Gender'])

# One-Hot Encoding for City
df = pd.get_dummies(df, columns=['City'], drop_first=True)

print("After Encoding Categorical Data:")
print(df)
print("\n")

# ------------------------------
# STEP 8: Final Clean Dataset
# ------------------------------
print("Final Preprocessed Dataset:")
print(df)
print("\n")

print("Data Preprocessing Completed Successfully ✅")

