price = float(input("How much did the meal cost?: "))
satis = int(input("How satisfied are you? 1 = Totally satisfied, 2 = Satisfied, 3 = Dissatisfied. :"))

if satis==1:
    tip_ratio = 0.2
    satisfied = "Totally satisfied"
elif satis==2:
    tip_ratio = 0.15
    satisfied = "Satisfied"
elif satis ==3:
    tip_ratio = 0.1
    satisfied = "Dissatisfied"
else: output = "Error"

tip = price * tip_ratio

print("You are ", satisfied, ".Your tip is ", tip)