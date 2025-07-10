#!/bin/bash

# Color Codes
RED='\033[0;31m'
GREEN='\033[0;32m'
CYAN='\033[0;36m'
YELLOW='\033[1;33m'
NC='\033[0m' # No Color

# Clear the screen
clear

# Fancy Header
echo -e "${CYAN}"
echo "==========================================="
echo "        🚀 Welcome to Your Terminal 🚀      "
echo "==========================================="
echo -e "${NC}"

# User Info
echo -e "${GREEN}👤 User:${NC} $(whoami)"
echo -e "${GREEN}🖥️  Kernel:${NC} $(uname -r)"
echo -e "${GREEN}📅 Date:${NC} $(date)"

# Footer line
echo -e "${CYAN}"
echo "==========================================="
echo -e "${NC}"
