# -----------------------------
# STEP 1: Import Required Libraries
# -----------------------------

import pandas as pd
import numpy as np
from sklearn.model_selection import train_test_split
from sklearn.linear_model import LinearRegression
from sklearn.metrics import mean_absolute_error, r2_score

# -----------------------------
# STEP 2: Create Sample Dataset
# -----------------------------
# We are predicting Salary based on Experience

data = {
    'Experience': [1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
                   11, 12, 13, 14, 15, 16, 17, 18, 19, 20],
    'Salary': [30000, 35000, 40000, 45000, 50000,
               55000, 60000, 65000, 70000, 75000,
               80000, 85000, 90000, 95000, 100000,
               105000, 110000, 115000, 120000, 125000]
}

df = pd.DataFrame(data)

print("Dataset:")
print(df)

# -----------------------------
# STEP 3: Define Features (X) and Target (y)
# -----------------------------
# X = input variable
# y = output variable we want to predict

X = df[['Experience']]   # Independent variable
y = df['Salary']         # Dependent variable

# -----------------------------
# STEP 4: Split Data into Training & Testing Sets
# -----------------------------
# 80% training, 20% testing
# u can change values as 60, 40
# only testing is to be provided

X_train, X_test, y_train, y_test = train_test_split(
    X, y, test_size=0.2, random_state=42
    # random_state=42 ensures reproducibility —
    # every time you run the code, you get the same train/test split
)

print("\nTraining Data Size:", len(X_train))
print("Testing Data Size:", len(X_test))

# -----------------------------
# STEP 5: Train Linear Regression Model
# -----------------------------

model = LinearRegression()
model.fit(X_train, y_train)

# -----------------------------
# STEP 6: Make Predictions
# -----------------------------

y_pred = model.predict(X_test)

print("\nActual Salary:", list(y_test))
print("Predicted Salary:", list(y_pred))

# -----------------------------
# STEP 7: Evaluate Model Performance
# -----------------------------

# MAE (Mean Absolute Error)
mae = mean_absolute_error(y_test, y_pred)

# R² Score (how well model fits data)
r2 = r2_score(y_test, y_pred)

print("\nModel Evaluation:")
print("Mean Absolute Error:", mae)
print("R2 Score:", r2)

print("\nPractical 3 Completed Successfully")
