import sqlite3
import os

try:
    os.remove('c:/Users/samee/Documents/GitHub/IIT-stuff/SD1/day-09-dbs/tut-001.db')
    print("File deleted")
except:
    print("File not found")

db = sqlite3.connect(
    'c:/Users/samee/Documents/GitHub/IIT-stuff/SD1/day-09-dbs/tut-001.db')
cursor = db.cursor()

cursor.execute('''
CREATE TABLE IF NOT EXISTS Contacts(contact_id INTEGER PRIMARRY KEY,first TEXT,last TEXT,email TEXT,phone INTEGER)
''')  # creating the db if not exist
db.commit()


cursor.execute('''
INSERT INTO contacts(first,last,email,phone) VALUES("Boris","Johnson","bj@number10.com",12345678),("Mahinda","Rajapaksa","mr@number10.com",69696969),("Ranil","Wikramasinghe","ranil@number10.com",09876543);
''')
db.commit()

cursor.execute('''
UPDATE Contacts SET phone = 87654321 WHERE first = "Boris"
''')
db.commit()

contacts_text = cursor.execute('''
SELECT * FROM contacts
''')
print(contacts_text.fetchall())

contacts_text_alt = cursor.execute('''
SELECT first,last FROM contacts;
''')
print(contacts_text_alt.fetchall())

ordered = cursor.execute('''
SELECT first,last FROM contacts ORDER BY last Asc;
''')
print(ordered.fetchall())

reqest = input("Enter a first name to search: ")
sql = "SELECT * FROM Contacts WHERE first = '" + reqest + "'"
try:
    response = cursor.execute(sql).fetchone
except:
    response = "Not Found"


print(response)

db.close()

#you can use ? in sql code to pass dynamic vars such as the input name in this tutorial