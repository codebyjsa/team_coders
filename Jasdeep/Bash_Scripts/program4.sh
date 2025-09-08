#!/bin/bash

# System Power Menu with ASCII Art
while true; do
    clear
    echo -e "\e[1;36m========================================\e[0m"
    echo -e "\e[1;35m   _____                 _                 \e[0m"
    echo -e "\e[1;35m  / ____|               | |                \e[0m"
    echo -e "\e[1;35m | (___   ___  _ __  ___| |_ ___  _ __ ___  \e[0m"
    echo -e "\e[1;35m  \\___ \\ / _ \\| '_ \\/ __| __/ _ \\| '__/ _ \\ \e[0m"
    echo -e "\e[1;35m  ____) | (_) | | | \\__ \\ || (_) | | |  __/ \e[0m"
    echo -e "\e[1;35m |_____/ \\___/|_| |_|___/\\__\\___/|_|  \\___| \e[0m"
    echo -e "\e[1;36m========================================\e[0m"
    echo -e "\e[1;33m1. \e[1;37m⏻ Shutdown\e[0m"
    echo -e "\e[1;33m2. \e[1;37m🔄 Reboot\e[0m"
    echo -e "\e[1;33m3. \e[1;37m⏸️  Halt\e[0m"
    echo -e "\e[1;31m4. 🚪 Exit\e[0m"
    echo -e "\e[1;36m========================================\e[0m"
    read -p $'\e[1;32mEnter your choice [1-4]: \e[0m' choice
    echo
    case $choice in
        1)
            echo -e "\e[1;31m\n   ⏻ SHUTDOWN\e[0m"
            echo -e "\e[1;37m========================\e[0m"
            sleep 1
            sudo shutdown now
            ;;
        2)
            echo -e "\e[1;33m\n   🔄 REBOOT\e[0m"
            echo -e "\e[1;37m========================\e[0m"
            sleep 1
            sudo reboot
            ;;
        3)
            echo -e "\e[1;34m\n   ⏸️  HALT\e[0m"
            echo -e "\e[1;37m========================\e[0m"
            sleep 1
            sudo halt
            ;;
        4)
            echo -e "\e[1;32m\nExiting...\e[0m"
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
done
