# number = r'^/d{5}-/d{5}'

import re

number = "This is my number 98820-66445"

n = r'^\d{5}-\d{5}$'

here = re.finditer(n, number)

print(here)