import pandas as pd
import numpy as np
import matplotlib.pyplot as plt

# Load the dataset
try:
    df = pd.read_csv('iris.csv')
    print("Dataset loaded successfully.")
except FileNotFoundError:
    print("Error: 'iris.csv' not found. Please ensure the file is in the same directory.")
    exit()

# --- Data Cleaning ---
print("\n--- Data Cleaning ---")
# 1. Drop 'Id' column if it exists
if 'Id' in df.columns:
    df = df.drop(columns=['Id'])
    print("'Id' column dropped.")

# 2. Check for null values
null_counts = df.isnull().sum()
if null_counts.sum() > 0:
    print(f"Null values found:\n{null_counts}")
    initial_rows = len(df)
    df = df.dropna()
    print(f"Dropped {initial_rows - len(df)} rows containing null values.")
else:
    print("No null values found.")

# --- Statistical Analysis ---
print("\n--- Statistical Analysis ---")
numerical_cols = ['SepalLengthCm', 'SepalWidthCm', 'PetalLengthCm', 'PetalWidthCm']

# Calculate Mean, Median, Variance
stats = df[numerical_cols].agg(['mean', 'median', 'var'])
print("\nStatistics (Mean, Median, Variance):")
print(stats)

# Calculate Correlation
correlation_matrix = df[numerical_cols].corr()
print("\nCorrelation Matrix:")
print(correlation_matrix)

# Interpret Correlations
print("\n--- Interpretation of Correlations ---")
print("Strong correlations (> 0.7 or < -0.7):")
for i in range(len(numerical_cols)):
    for j in range(i + 1, len(numerical_cols)):
        col1 = numerical_cols[i]
        col2 = numerical_cols[j]
        corr = correlation_matrix.loc[col1, col2]
        if abs(corr) > 0.7:
            direction = "Positive" if corr > 0 else "Negative"
            print(f"- {col1} vs {col2}: {corr:.2f} ({direction})")


# --- Visualization ---
print("\n--- Generating Visualizations ---")

# 1. Histograms
plt.figure(figsize=(10, 6))
for i, col in enumerate(numerical_cols):
    plt.subplot(2, 2, i + 1)
    plt.hist(df[col], bins=15, color='skyblue', edgecolor='black')
    plt.title(f'Histogram of {col}')
    plt.xlabel(col)
    plt.ylabel('Frequency')
plt.tight_layout()
plt.show()

# 2. Box Plots
plt.figure(figsize=(10, 6))
plt.boxplot([df[col] for col in numerical_cols], labels=numerical_cols)
plt.title('Box Plots of Features')
plt.ylabel('Cm')
plt.grid(True, linestyle='--', alpha=0.7)
plt.show()

# 3. Scatter Plot (Sepal Length vs. Sepal Width) - Example
plt.figure(figsize=(8, 6))
species = df['Species'].unique()
colors = ['r', 'g', 'b']
for i, sp in enumerate(species):
    subset = df[df['Species'] == sp]
    plt.scatter(subset['SepalLengthCm'], subset['SepalWidthCm'], label=sp, color=colors[i % len(colors)], alpha=0.7)
plt.title('Scatter Plot: Sepal Length vs Sepal Width')
plt.xlabel('Sepal Length (cm)')
plt.ylabel('Sepal Width (cm)')
plt.legend()
plt.show()

# 4. Scatter Plot (Petal Length vs. Petal Width) - Strong Correlation Example
plt.figure(figsize=(8, 6))
for i, sp in enumerate(species):
    subset = df[df['Species'] == sp]
    plt.scatter(subset['PetalLengthCm'], subset['PetalWidthCm'], label=sp, color=colors[i % len(colors)], alpha=0.7)
plt.title('Scatter Plot: Petal Length vs Petal Width')
plt.xlabel('Petal Length (cm)')
plt.ylabel('Petal Width (cm)')
plt.legend()
plt.show()

# 5. Helper function to plot heatmap correlation matrix using only matplotlib
def plot_heatmap(corr_matrix):
    plt.figure(figsize=(8, 6))
    plt.imshow(corr_matrix, cmap='coolwarm', interpolation='nearest')
    plt.colorbar()
    plt.xticks(range(len(corr_matrix.columns)), corr_matrix.columns, rotation=45)
    plt.yticks(range(len(corr_matrix.columns)), corr_matrix.columns)
    plt.title('Correlation Heatmap')
    
    # Add text annotations
    for i in range(len(corr_matrix.columns)):
        for j in range(len(corr_matrix.columns)):
            plt.text(j, i, f"{corr_matrix.iloc[i, j]:.2f}", 
                     ha='center', va='center', color='black')
    
    plt.tight_layout()
    plt.show()

plot_heatmap(correlation_matrix)

print("\nEDA Completed. Visualizations generated.")
