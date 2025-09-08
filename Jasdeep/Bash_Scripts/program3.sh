#!/bin/bash

# Beautiful Menu UI with ASCII Art
while true; do
    clear
    echo -e "\e[1;36m========================================\e[0m"
    echo -e "\e[1;35m   ____            _                  _         _             \e[0m"
    echo -e "\e[1;35m  / ___| _   _ ___| |_ ___ _ __ _   _| | __ _  | |_ ___  _ __ \e[0m"
    echo -e "\e[1;35m  \\___ \\| | | / __| __/ _ \\ '__| | | | |/ _\` | | __/ _ \\| '__|\e[0m"
    echo -e "\e[1;35m   ___) | |_| \\__ \\ ||  __/ |  | |_| | (_| | | || (_) | |   \e[0m"
    echo -e "\e[1;35m  |____/ \\__, |___/\\__\\___|_|   \\__,_|\\__,_|  \\__\\___/|_|   \e[0m"
    echo -e "\e[1;35m         |___/                                            \e[0m"
    echo -e "\e[1;36m========================================\e[0m"
    echo -e "\e[1;33m1. \e[1;37m👤 Show User Info\e[0m"
    echo -e "\e[1;33m2. \e[1;37m💻 Show System Info\e[0m"
    echo -e "\e[1;33m3. \e[1;37m🧠 Show Memory and Disk Usage\e[0m"
    echo -e "\e[1;33m4. \e[1;37m🌐 Show Network Info\e[0m"
    echo -e "\e[1;31m5. 🚪 Exit\e[0m"
    echo -e "\e[1;36m========================================\e[0m"
    read -p $'\e[1;32mEnter your choice [1-5]: \e[0m' choice
    echo
    case $choice in
        1)
            echo -e "\e[1;34m\n   👤 USER INFO\e[0m"
            echo -e "\e[1;37m========================\e[0m"
            echo "Username: $USER"
            echo "Home Directory: $HOME"
            echo "Shell: $SHELL"
            echo "UID: $UID"
            echo "Groups: $(groups)"
            echo -e "\e[1;37m========================\e[0m"
            ;;
        2)
            echo -e "\e[1;34m\n   💻 SYSTEM INFO\e[0m"
            echo -e "\e[1;37m========================\e[0m"
            uname -a
            lsb_release -a 2>/dev/null || cat /etc/os-release 2>/dev/null
            echo -e "\e[1;37m========================\e[0m"
            ;;
        3)
            echo -e "\e[1;34m\n   🧠 MEMORY USAGE\e[0m"
            echo -e "\e[1;37m========================\e[0m"
            free -h
            echo -e "\e[1;34m\n   💾 DISK USAGE\e[0m"
            echo -e "\e[1;37m========================\e[0m"
            df -h
            echo -e "\e[1;37m========================\e[0m"
            ;;
        4)
            echo -e "\e[1;34m\n   🌐 NETWORK INFO\e[0m"
            echo -e "\e[1;37m========================\e[0m"
            ip a || ifconfig
            echo -e "\e[1;34m\n   🛣️  ROUTING TABLE\e[0m"
            echo -e "\e[1;37m========================\e[0m"
            ip route || route -n
            echo -e "\e[1;37m========================\e[0m"
            ;;
        5)
            echo -e "\e[1;31m\nExiting... Have a nice day!\e[0m"
            sleep 1
            clear
            exit 0
            ;;
        *)
            echo -e "\e[1;31mInvalid option. Please try again.\e[0m"
            ;;
    esac
    echo -e "\n\e[1;36mPress Enter to continue...\e[0m"
    read
    clear
done
