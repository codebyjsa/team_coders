#!bin/bash
 echo " ====User Account Membership Script===="
 echo " 1.Add new user:"
 echo " 2.Delete a user:"
 echo " 3.Change a userpassword:"
 echo " 4.User doesn't Exist"
  echo " "
  echo " "

  echo " Enter a number (1-3): "
  read num
  case $num in
  
        1)echo "Add New User : "
        read username
        sudo useradd $username
        echo "==== $username successfully added====";;

        2)echo " Delete a User:"
                read username
                sudo userdel $username
                echo "==== $username Deleted successfully ====";;

        3) echo " Change a User password: "
                read username 
                sudo passwd $username 
                echo "==== Password changed successfully";;