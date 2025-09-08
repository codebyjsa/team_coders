#!/bin/bash
# Terminal Colors
GREEN='\033[0;32m'
NC='\033[0m' # No Color
# ASCII Art Banner Function
show_banner() {
 clear
 echo -e "${GREEN}"
 echo " ____ _ _ _ _ _ _ _ _ _ "
 echo " | __ )(_) | | __| | __| | |__ (_) |__ _ _| | __ _ _ __ "
 echo " | _ \\| | | |/ _\` |/ _\` | '_ \\| | '_ \\| | | | |/ _\` | '_ \\"
 echo " | |_) | | | | (_| | (_| | |_) | | |_) | |_| | | (_| | | | |"
 echo " |____/|_|_|_|\\__,_|\\__,_|_.__/|_|_.__/ \\__,_|_|\\__,_|_| |_|"
 echo " "
 echo " MULTI-BILL GENERATOR v2.0 "
 echo -e "${NC}"
 sleep 1
}
# Animated Loading Function
loading_animation() {
 local msg="$1"
 echo -n "$msg"
 for i in {1..3}; do
 echo -n "."
 sleep 0.1
 done
 echo
}
# Function to input multiple items
generate_items_list() {
 items=()
 quantities=()
 prices=()
 totals=()
 while true; do
 read -p "Enter Item Name (or type 'done' to finish): " item
 if [[ "$item" == "done" ]]; then
 break
 fi
 read -p "Enter Quantity: " qty
 read -p "Enter Price per Unit: " price
 total=$((qty * price))
 items+=("$item")
 quantities+=("$qty")
 prices+=("$price")
 totals+=("$total")
 done
}
# Function to display the bill with GST
display_bill() {
 name="$1"
 bill_type="$2"
 date=$(date)
 echo -e "\n${GREEN}********** $bill_type Bill **********${NC}"
 echo "Customer Name : $name"
 echo "Date : $date"
 echo "------------------------------------------"
 echo -e "Item\t\tQty/Days\tPrice\tTotal"
 echo "------------------------------------------"
 grand_total=0
 for i in "${!items[@]}"; do
 if [[ "$bill_type" == "Hotel" && $i -eq 0 ]]; then
 # For hotel bill, first item is Room Rent, show 'Days' instead of 'Qty'
 printf "%-10s\t%-7s\t%-5s\t%-6s\n" "${items[$i]}" "Days: ${quantities[$i]}" "$
{prices[$i]}" "${totals[$i]}"
 else
 printf "%-10s\t%-7s\t%-5s\t%-6s\n" "${items[$i]}" "${quantities[$i]}" "$
{prices[$i]}" "${totals[$i]}"
 fi
 grand_total=$((grand_total + totals[$i]))
 done
 gst=18
 gst_amount=$((grand_total * gst / 100))
 net_total=$((grand_total + gst_amount))
 echo "------------------------------------------"
 echo "Subtotal : Rs.$grand_total"
 echo "GST ($gst%) : Rs.$gst_amount"
 echo "Total Payable : Rs.$net_total"
 echo "******************************************"
}
# Individual bill generator functions
electricity_bill() {
 #!/bin/bash
 echo "======================================"
 echo " ELECTRICITY BILL GENERATOR "
 echo "======================================"
 echo
 read -p "Enter Customer Name : " customer_name
 while true; do
 read -p "Enter Units Consumed : " units
 if [[ "$units" =~ ^[0-9]+$ ]]; then
 break
 else
 echo "Invalid input! Please enter a positive number."
 fi
 done
# Calculate bill amount based on slabs
if (( units <= 100 )); then
 amount=$(( units * 5 ))
elif (( units <= 300 )); then
 amount=$(( 100 * 5 + (units - 100) * 7 ))
else
 amount=$(( 100 * 5 + 200 * 7 + (units - 300) * 10 ))
fi
echo
echo "--------------------------------------"
echo " ELECTRICITY BILL "
echo "--------------------------------------"
printf "Customer Name : %s\n" "$customer_name"
printf "Units Consumed : %d\n" "$units"
printf "Amount to Pay : %d\n" "$amount" ₹
echo "--------------------------------------"
echo " Thank you for your payment! "
echo "======================================"
read -p "Do you want to save the bill to a file? (y/n): " save_choice
if [[ "$save_choice" =~ ^[Yy]$ ]]; then
 timestamp=$(date +%Y%m%d_%H%M%S)
 filename="bill_${customer_name// /_}_$timestamp.txt"
 {
 echo "======================================"
 echo " ELECTRICITY BILL "
 echo "======================================"
 printf "Customer Name : %s\n" "$customer_name"
 printf "Units Consumed : %d\n" "$units"
 printf "Amount to Pay : %d\n" "$amount" ₹
 echo "======================================"
 echo " Thank you for your payment! "
 } > "$filename"
 echo "Bill saved successfully as '$filename'"
else
 echo "Bill not saved."
fi
}
medical_bill() {
 echo "======================================"
 echo " MEDICAL BILL GENERATOR "
 echo "======================================"
 echo
 read -p "Enter Patient Name : " patient_name
 while true; do
 read -p "Enter number of services : " service_count
 if [[ "$service_count" =~ ^[0-9]+$ ]] && (( service_count > 0 )); then
 break
 else
 echo "Invalid input! Enter a positive integer."
 fi
 done
declare -a services
 declare -a costs
 total=0
 for (( i=1; i<=service_count; i++ ))
 do
 read -p "Enter name of service #$i : " svc_name
 while true; do
 read -p "Enter cost of $svc_name : " svc_cost ₹
 if [[ "$svc_cost" =~ ^[0-9]+(\.[0-9]{1,2})?$ ]]; then
 break
 else
 echo "Invalid cost! Please enter a valid number (e.g., 150 or 99.99)."
 fi
 done
 services+=("$svc_name")
 costs+=("$svc_cost")
 # Use bc for decimal addition
 total=$(echo "$total + $svc_cost" | bc)
 done
 echo
 echo "--------------------------------------"
 echo " MEDICAL BILL "
 echo "--------------------------------------"
 printf "Patient Name : %s\n" "$patient_name"
 echo "Services:"
 for (( i=0; i<service_count; i++ ))
 do
 printf " %-20s : %s\n" "${services[i]}" "${costs[i]}" ₹
 done
 echo "--------------------------------------"
 printf "Total Amount : %.2f\n" "$total" ₹
 echo "--------------------------------------"
 echo " Wishing you good health! "
 echo "======================================"
 echo
 read -p "Do you want to save the bill to a file? (y/n): " save_choice
if [[ "$save_choice" =~ ^[Yy]$ ]]; then
 timestamp=$(date +%Y%m%d_%H%M%S)
 filename="medical_bill_${patient_name// /_}_$timestamp.txt"
 {
 echo "======================================"
 echo " MEDICAL BILL "
 echo "======================================"
 printf "Patient Name : %s\n" "$patient_name"
 echo "Services:"
 for (( i=0; i<service_count; i++ ))
 do
 printf " %-20s : %s\n" "${services[i]}" "${costs[i]}" ₹
 done
 echo "--------------------------------------"
 printf "Total Amount : %.2f\n" "$total" ₹
 echo "--------------------------------------"
 echo " Wishing you good health! "
 echo "======================================"
 } > "$filename"
 echo "Bill saved successfully as '$filename'"
 else
 echo "Bill not saved"
 fi
}
hotel_bill() {
 echo -e "\n${GREEN}--- Hotel Bill ---${NC}"
 read -p "Enter Guest Name: " name
 read -p "Enter Number of Days Stayed: " days
 items=()
 quantities=()
 prices=()
 totals=()
 # Add room rent as the first item
 read -p "Enter Room Rent per Day: " room_rent
 room_total=$((room_rent * days))
 items+=("Room Rent")
quantities+=("Days: $days")
 prices+=("$room_rent")
 totals+=("$room_total")
 # Add other hotel services/items
 while true; do
 read -p "Enter Service/Item Name (or type 'done' to finish): " item
 if [[ "$item" == "done" ]]; then
 break
 fi
 read -p "Enter Quantity: " qty
 read -p "Enter Price per Unit: " price
 total=$((qty * price))
 items+=("$item")
 quantities+=("$qty")
 prices+=("$price")
 totals+=("$total")
 done
 # Custom display for hotel bill
 date=$(date)
 echo -e "\n${GREEN}********** Hotel Bill **********${NC}"
 echo "Customer Name : $name"
 echo "Date : $date"
 echo "------------------------------------------"
 printf "%-15s%-15s%-8s%-8s\n" "Item" "Qty/Days" "Price" "Total"
 echo "------------------------------------------"
 grand_total=0
 for i in "${!items[@]}"; do
 printf "%-15s%-15s%-8s%-8s\n" "${items[$i]}" "${quantities[$i]}" "${prices[$i]}" "$
{totals[$i]}"
 grand_total=$((grand_total + totals[$i]))
 done
 gst=18
 gst_amount=$((grand_total * gst / 100))
 net_total=$((grand_total + gst_amount))
 echo "------------------------------------------"
 echo "Subtotal : Rs.$grand_total"
 echo "GST ($gst%) : Rs.$gst_amount"
 echo "Total Payable : Rs.$net_total"
echo "******************************************"
 # Save bill prompt
 output="********** Hotel Bill **********\n"
 output+="Customer Name : $name\n"
 output+="Date : $date\n"
 output+="------------------------------------------\n"
 output+=$(printf "%-15s%-15s%-8s%-8s\n" "Item" "Qty/Days" "Price" "Total")
 output+="------------------------------------------\n"
 for i in "${!items[@]}"; do
 output+=$(printf "%-15s%-15s%-8s%-8s\n" "${items[$i]}" "${quantities[$i]}" "$
{prices[$i]}" "${totals[$i]}")
 done
 output+="------------------------------------------\n"
 output+="Subtotal : Rs.$grand_total\n"
 output+="GST ($gst%) : Rs.$gst_amount\n"
 output+="Total Payable : Rs.$net_total\n"
 output+="******************************************\n"
 save_bill_prompt "$output"
}
garment_bill() {
 #!/bin/bash
 echo "==========================================="
 echo " GARMENT SHOP BILL GENERATOR "
 echo "==========================================="
 echo
 read -p "Enter Customer Name : " customer_name
 while true; do
 read -p "Enter number of items : " item_count
 if [[ "$item_count" =~ ^[0-9]+$ ]] && (( item_count > 0 )); then
 break
 else
 echo "Invalid input! Enter a positive number."
 fi
 done
 declare -a item_names
 declare -a item_qty
 declare -a item_price
 declare -a item_total
grand_total=0
 for (( i=1; i<=item_count; i++ ))
 do
 echo
 echo "Item #$i:"
 read -p " Garment Name : " name
 read -p " Quantity : " qty
 read -p " Price per item ( ) : " price ₹
 total=$(echo "$qty * $price" | bc)
 item_names+=("$name")
 item_qty+=("$qty")
 item_price+=("$price")
 item_total+=("$total")
 grand_total=$(echo "$grand_total + $total" | bc)
 done
 echo
 echo "-------------------------------------------"
 echo " GARMENT BILL "
 echo "-------------------------------------------"
 printf "Customer Name: %s\n" "$customer_name"
 echo "-------------------------------------------"
 printf "%-20s %-10s %-10s %-10s\n" "Item" "Qty" "Price" "Total"
 echo "-------------------------------------------"
 for (( i=0; i<item_count; i++ ))
 do
 printf "%-20s %-10s %-10s %-10s\n" "${item_names[i]}" "${item_qty[i]}" " $₹
{item_price[i]}" " ${item_total[i]}" ₹
 done
 echo "-------------------------------------------"
 printf "Grand Total: %.2f\n" "$grand_total" ₹
 echo "-------------------------------------------"
 echo " Thank you for shopping with us! "
 echo "==========================================="
 echo
 read -p "Do you want to save the bill to a file? (y/n): " save_choice
if [[ "$save_choice" =~ ^[Yy]$ ]]; then
 timestamp=$(date +%Y%m%d_%H%M%S)
 filename="garment_bill_${customer_name// /_}_$timestamp.txt"
 {
 echo "==========================================="
 echo " GARMENT BILL "
 echo "==========================================="
 printf "Customer Name: %s\n" "$customer_name"
 echo "-------------------------------------------"
 printf "%-20s %-10s %-10s %-10s\n" "Item" "Qty" "Price" "Total"
 echo "-------------------------------------------"
 for (( i=0; i<item_count; i++ ))
 do
 printf "%-20s %-10s %-10s %-10s\n" "${item_names[i]}" "${item_qty[i]}" " $₹
{item_price[i]}" " ${item_total[i]}" ₹
 done
 echo "-------------------------------------------"
 printf "Grand Total: %.2f\n" "$grand_total" ₹
 echo "-------------------------------------------"
 echo " Thank you for shopping with us! "
 echo "==========================================="
 } > "$filename"
 echo " Bill saved as '$filename'" ✅
 else
 echo " Bill not saved." 📝
 fi
}
restaurant_bill() {
 #!/bin/bash
 echo "=========================================="
 echo " RESTAURANT BILL GENERATOR "
 echo "=========================================="
 echo
 read -p "Enter Customer Name : " customer_name
 while true; do
 read -p "Enter number of items : " item_count
 if [[ "$item_count" =~ ^[0-9]+$ ]] && (( item_count > 0 )); then
 break
 else
 echo " Invalid input! Enter a positive number." ❌
 fi
 done
 declare -a item_names
 declare -a item_qty
 declare -a item_price
 declare -a item_total
 grand_total=0
 for (( i=1; i<=item_count; i++ ))
 do
 echo
 echo "Item #$i:"
 read -p " Food Item Name : " name
 read -p " Quantity : " qty
 read -p " Price per item ( ) : " price ₹
 total=$(echo "$qty * $price" | bc)
 item_names+=("$name")
 item_qty+=("$qty")
 item_price+=("$price")
 item_total+=("$total")
 grand_total=$(echo "$grand_total + $total" | bc)
 done
 echo
 echo "------------------------------------------"
 echo " RESTAURANT BILL "
 echo "------------------------------------------"
 printf "Customer Name: %s\n" "$customer_name"
 echo "------------------------------------------"
 printf "%-20s %-10s %-10s %-10s\n" "Item" "Qty" "Price" "Total"
 echo "------------------------------------------"
 for (( i=0; i<item_count; i++ ))
 do
 printf "%-20s %-10s %-9s %-9s\n" "${item_names[i]}" "${item_qty[i]}" "$ ₹ ₹
{item_price[i]}" "${item_total[i]}"
done
 echo "------------------------------------------"
 printf "Grand Total: %.2f\n" "$grand_total" ₹
 echo "------------------------------------------"
 echo " Thank you for dining with us! " 🍽️
 echo "=========================================="
 echo
# Saving prompt
read -p "Do you want to save this bill to a file? (y/n): " save_choice
if [[ "$save_choice" =~ ^[Yy]$ ]]; then
 timestamp=$(date +%Y%m%d_%H%M%S)
 filename="restaurant_bill_${customer_name// /_}_$timestamp.txt"
 {
 echo "=========================================="
 echo " RESTAURANT BILL "
 echo "=========================================="
 printf "Customer Name: %s\n" "$customer_name"
 echo "------------------------------------------"
 printf "%-20s %-10s %-10s %-10s\n" "Item" "Qty" "Price" "Total"
 echo "------------------------------------------"
 for (( i=0; i<item_count; i++ ))
 do
 printf "%-20s %-10s %-9s %-9s\n" "${item_names[i]}" "${item_qty[i]}" "$ ₹ ₹
{item_price[i]}" "${item_total[i]}"
 done
 echo "------------------------------------------"
 printf "Grand Total: %.2f\n" "$grand_total" ₹
 echo "------------------------------------------"
 echo " Thank you for dining with us! " 🍽️
 echo "=========================================="
 } > "$filename"
 echo " Bill saved as '$filename'" ✅
else
 echo " Bill not saved." 📝
fi
}
food_items_bill() {
 #!/bin/bash
 echo "=============================================="
 echo " VEGETABLE SHOP BILL GENERATOR "
 echo "=============================================="
 echo
 read -p "Enter Customer Name : " customer_name
# Validate item count input
while true; do
 read -p "Enter number of vegetables : " item_count
 if [[ "$item_count" =~ ^[0-9]+$ ]] && (( item_count > 0 )); then
 break
 else
 echo " Invalid input! Please enter a positive number." ❌
 fi
done
# Declare arrays to store item details
declare -a veg_names
declare -a veg_qty
declare -a veg_price
declare -a veg_total
grand_total=0
# Input loop for each vegetable
for (( i=1; i<=item_count; i++ ))
do
 echo
 echo "Vegetable #$i:"
 read -p " Vegetable Name : " name
 read -p " Quantity (kg) : " qty
 read -p " Price per kg ( ) : " price ₹
 total=$(echo "$qty * $price" | bc)
 veg_names+=("$name")
 veg_qty+=("$qty")
 veg_price+=("$price")
veg_total+=("$total")
 grand_total=$(echo "$grand_total + $total" | bc)
done
# Display the bill
echo
echo "------------------------------------------------"
echo " VEGETABLE BILL "
echo "------------------------------------------------"
printf "Customer Name: %s\n" "$customer_name"
echo "------------------------------------------------"
printf "%-20s %-10s %-10s %-10s\n" "Vegetable" "Qty(kg)" "Rate" "Total"
echo "------------------------------------------------"
for (( i=0; i<item_count; i++ ))
do
 printf "%-20s %-10s %-9s %-9s\n" "${veg_names[i]}" "${veg_qty[i]}" "${veg_price[i]}" ₹ ₹
"${veg_total[i]}"
done
echo "------------------------------------------------"
printf "Grand Total: %.2f\n" "$grand_total" ₹
echo "------------------------------------------------"
echo " Thank you for shopping with us! " 🥕
echo "==============================================="
echo
# Prompt to save the bill
read -p "Do you want to save this bill to a file? (y/n): " save_choice
if [[ "$save_choice" =~ ^[Yy]$ ]]; then
 timestamp=$(date +%Y%m%d_%H%M%S)
 filename="veg_bill_${customer_name// /_}_$timestamp.txt"
 {
 echo "=============================================="
 echo " VEGETABLE BILL "
 echo "=============================================="
 printf "Customer Name: %s\n" "$customer_name"
 echo "------------------------------------------------"
 printf "%-20s %-10s %-10s %-10s\n" "Vegetable" "Qty(kg)" "Rate" "Total"
 echo "------------------------------------------------"
for (( i=0; i<item_count; i++ ))
 do
 printf "%-20s %-10s %-9s %-9s\n" "${veg_names[i]}" "${veg_qty[i]}" "$ ₹ ₹
{veg_price[i]}" "${veg_total[i]}"
 done
 echo "------------------------------------------------"
 printf "Grand Total: %.2f\n" "$grand_total" ₹
 echo "------------------------------------------------"
 echo " 🥦 Thank you for shopping with us! "
 echo "=============================================="
 } > "$filename"
 echo " Bill saved successfully as '$filename'" ✅
else
 echo " Bill not saved." 📝
fi
}
general_goods_bill() {
 #!/bin/bash
 echo "=================================================="
 echo " GENERAL GOODS BILL GENERATOR "
 echo "=================================================="
 echo
 read -p "Enter Customer Name : " customer_name
# Validate item count input
while true; do
 read -p "Enter number of items purchased : " item_count
 if [[ "$item_count" =~ ^[0-9]+$ ]] && (( item_count > 0 )); then
 break
 else
 echo " Invalid input! Please enter a positive number." ❌
 fi
done
# Declare arrays
declare -a item_names
declare -a item_qty
declare -a item_price
declare -a item_total
grand_total=0
# Input for each item
for (( i=1; i<=item_count; i++ ))
do
 echo
 echo "Item #$i:"
 read -p " Item Name : " name
 read -p " Quantity : " qty
 read -p " Price per unit ( ) : " price ₹
 total=$(echo "$qty * $price" | bc)
 item_names+=("$name")
 item_qty+=("$qty")
 item_price+=("$price")
 item_total+=("$total")
 grand_total=$(echo "$grand_total + $total" | bc)
done
# Show formatted bill
echo
echo "--------------------------------------------------"
echo " GENERAL GOODS BILL "
echo "--------------------------------------------------"
printf "Customer Name: %s\n" "$customer_name"
echo "--------------------------------------------------"
printf "%-20s %-10s %-10s %-10s\n" "Item" "Qty" "Price" "Total"
echo "--------------------------------------------------"
for (( i=0; i<item_count; i++ ))
do
 printf "%-20s %-10s %-9s %-9s\n" "${item_names[i]}" "${item_qty[i]}" "$ ₹ ₹
{item_price[i]}" "${item_total[i]}"
done
echo "--------------------------------------------------"
printf "Grand Total: %.2f\n" "$grand_total" ₹
echo "--------------------------------------------------"
echo " Thank you for your purchase! " 🛍️
echo "=================================================="
echo
# Save prompt
read -p "Do you want to save this bill to a file? (y/n): " save_choice
if [[ "$save_choice" =~ ^[Yy]$ ]]; then
 timestamp=$(date +%Y%m%d_%H%M%S)
 filename="goods_bill_${customer_name// /_}_$timestamp.txt"
 {
 echo "=================================================="
 echo " GENERAL GOODS BILL "
 echo "=================================================="
 printf "Customer Name: %s\n" "$customer_name"
 echo "--------------------------------------------------"
 printf "%-20s %-10s %-10s %-10s\n" "Item" "Qty" "Price" "Total"
 echo "--------------------------------------------------"
 for (( i=0; i<item_count; i++ ))
 do
 printf "%-20s %-10s %-9s %-9s\n" "${item_names[i]}" "${item_qty[i]}" "$ ₹ ₹
{item_price[i]}" "${item_total[i]}"
 done
 echo "--------------------------------------------------"
 printf "Grand Total: %.2f\n" "$grand_total" ₹
 echo "--------------------------------------------------"
 echo " Thank you for your purchase! " 🛒
 echo "=================================================="
 } > "$filename"
 echo " Bill saved as '$filename'" ✅
else
 echo " Bill not saved." 📝
fi
}
save_bill_prompt() {
 read -p "Do you want to save this bill? (y/n): " save
 if [[ "$save" == "y" || "$save" == "Y" ]]; then
 filename="bill_${name// /_}_$(date +%Y%m%d%H%M%S).txt"
 echo -e "$1" > "$filename"
 echo -e "${GREEN}Bill saved to $filename${NC}"
 fi
}
# Main Menu
while true; do
 show_banner
 echo -e "${GREEN}====== Multi-Bill Generator ======${NC}"
 echo "1. Electricity Bill"
 echo "2. Medical Bill"
 echo "3. Hotel Bill"
 echo "4. Garment Shop Bill"
 echo "5. Restaurant Bill"
 echo "6. vegetable Bill"
 echo "7. General Goods Bill"
 echo "8. Exit"
 read -p "Choose your option [1-8]: " choice
 case $choice in
 1) loading_animation "Generating Electricity Bill"; electricity_bill;;
 2) loading_animation "Generating Medical Bill"; medical_bill;;
 3) loading_animation "Generating Hotel Bill"; hotel_bill;;
 4) loading_animation "Generating Garment Shop Bill"; garment_bill;;
 5) loading_animation "Generating Restaurant Bill"; restaurant_bill;;
 6) loading_animation "Generating Food Items Bill"; food_items_bill;;
 7) loading_animation "Generating General Goods Bill"; general_goods_bill;;
 8) echo -e "${GREEN}Thank you for using the Bill Generator.${NC}"; exit;;
 *) echo -e "${RED}Invalid choice. Please enter a number between 1 and 8.${NC}";;
 esac
 sleep 1
 read -p "Press Enter to return to the main menu..."
done 