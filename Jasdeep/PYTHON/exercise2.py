import time

hour = int(time.strftime("%H"))

if(hour>=00 and hour<12):
    print("Good Morning, Sir")
elif(hour>=12 and hour<=15):
    print("Good afternoon, sir")
elif(hour>15 and hour<=20):
    print("Good Evening, sir")
else:
    print("Good Night, sir")
