import sqlite3
db = sqlite3.connect('c:/Users/samee/Documents/GitHub/IIT-stuff/SD1/day-09-dbs/ex-001.db')
cursor = db.cursor()
cursor.execute('''
CREATE TABLE IF NOT EXISTS users(id INTEGER PRIMARY KEY, name TEXT, phone TEXT, email TEXT unique, password TEXT)
''')
db.commit()
db.close()

print('Done')
