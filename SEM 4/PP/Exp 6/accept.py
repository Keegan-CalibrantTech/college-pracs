import pymysql
from tkinter import *
def add(event):

	connection=pymysql.connect(
		host="localhost",
		user="root",
		db="experiment"
		)
	cur=connection.cursor()
	r=int(ro.get())
	n=nm.get()
	sal=int(sa.get())
	date=da.get()
	s="insert into employee(empno, EmpName, Salary, DOJ) values ('%d','%s','%d','%s')"
	args=(r,n,sal,date)

	try:
		cur.execute(s%args)
		print("added")
	except:
		print("something went wrong")

	connection.commit()
	connection.close()

window=Tk()
window.geometry("500x500")

lbl=Label(window, text="empno")
lbl.place(x=60,y=50)
ro=Entry(window)
ro.place(x=180,y=50)

lb2=Label(window, text="EmpName")
lb2.place(x=60,y=80)
nm=Entry(window)
nm.place(x=180,y=80)

lb3=Label(window, text="Salary")
lb3.place(x=60,y=110)
sa=Entry(window)
sa.place(x=180,y=110)

lb4=Label(window, text="DOJ")
lb4.place(x=60,y=140)
da=Entry(window)
da.place(x=180,y=140)

btn=Button(window, text="add record")
btn.place(x=200,y=160)
btn.bind('<Button-1>',add)
