tel = { 'Andrea' : 4351, 'Gill' : 3506 }
tel['Ivan'] = 3483
print(tel['Andrea'])
print(*tel.keys())
tel['Ivan']=4422
print(tel)
print(tel.get("Roy"))
print(*tel.values())
if "Andrea" in tel:
    print("Andrea is in the dictionary")