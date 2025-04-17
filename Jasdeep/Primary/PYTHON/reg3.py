import re

# Sample URL
url = "https://example.com/archive/2025/04/06/article-title"

# Regular expression to extract year, month, date
pattern = r"/(\d{4})/(\d{2})/(\d{2})/"

match = re.search(pattern, url)
if match:
    year, month, day = match.groups()
    print(f"Year: {year}, Month: {month}, Date: {day}")
else:
    print("No date found in the URL.")
