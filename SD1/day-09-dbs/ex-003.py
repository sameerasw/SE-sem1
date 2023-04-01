import sqlite3
import os


os.remove('c:/Users/samee/Documents/GitHub/IIT-stuff/SD1/day-09-dbs/ex-003.db')

db = sqlite3.connect(
    'c:/Users/samee/Documents/GitHub/IIT-stuff/SD1/day-09-dbs/ex-003.db')
cursor = db.cursor()

cursor.execute('''
CREATE TABLE IF NOT EXISTS Cars(brand TEXT PRIMARY KEY, number INTEGER, country TEXT)
''')  # creating the db if not exist
db.commit()

cursor.execute('''
INSERT INTO Cars(brand,number,country) VALUES("Nissan",100,"Japan"),("Toyota",200,"Japan"),("Maruti",50,"India")
''')

cursor.execute('''
DELETE from Cars WHERE Brand = "Maruti"
''')

cursor.execute('''
INSERT INTO Cars (brand,number,country) VALUES("Range Rover",250,"UK")
''')
db.commit()

# cursor.execute('''
# UPDATE Cars SET country = "Germany" WHERE country = "UK"
# ''')
# db.commit()

for cars in cursor.execute('''
SELECT * from Cars
'''):
    print(cars)

db.close()
