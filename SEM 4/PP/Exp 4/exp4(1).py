from tkinter import *
import tkinter as tk  
from tkinter import ttk

def reset_values():
    entry_1.delete(0,'end')
    entry_2.delete(0,'end')
    entry_3.delete(0,'end')
    entry_4.delete(0,'end')
    number=""
    entry_6.delete(0,'end')
    var=""
    c.set('Interested Course')
    var1=""
    var2=""
    var3=""

    
root = tk.Tk()
root.geometry('500x700')
root.title("Registration Form")

label_0 = Label(root, text="Registration form",width=20,font=("bold", 20))
label_0.place(x=90,y=53)


label_1 = Label(root, text="Username",width=20,font=("bold", 10))
label_1.place(x=80,y=130)

entry_1 = Entry(root)
entry_1.place(x=240,y=130)

label_2 = Label(root, text="Password",width=20,font=("bold", 10))
label_2.place(x=80,y=180)

entry_2 = Entry(root)
entry_2.place(x=240,y=180)
 
label_3 = Label(root, text="Contact No",width=20,font=("bold", 10))
label_3.place(x=73,y=230)

entry_3 = Entry(root)
entry_3.place(x=240,y=230)

label_4 = Label(root, text="Address",width=20,font=("bold", 10))
label_4.place(x=73,y=280)

entry_4 = Entry(root)
entry_4.place(x=240,y=280)

label_5 = Label(root, text="Country",width=20,font=("bold", 10))
label_5.place(x=73,y=330)
number = tk.StringVar()  
numberChosen = ttk.Combobox(root, width = 17)# Adding Values  
numberChosen['values'] = ("India", "USA", "England")  
numberChosen.grid(column = 0, row = 1)  
numberChosen.current()# Calling Main()
numberChosen.place(x=240,y=330)

label_6 = Label(root, text="Email",width=20,font=("bold", 10))
label_6.place(x=73,y=380)

entry_6 = Entry(root)
entry_6.place(x=240,y=380)

label_7 = Label(root, text="Gender",width=20,font=("bold", 10))
label_7.place(x=73,y=430)
var = IntVar()
Radiobutton(root, text="Male",padx = 5, value=1).place(x=235,y=430)
Radiobutton(root, text="Female",padx = 20, value=2).place(x=290,y=430)

label_8 = Label(root, text="Languages",width=20,font=("bold", 10))
label_8.place(x=73,y=480)
var1 = IntVar()
Checkbutton(root, text="English").place(x=235,y=480)
var2 = IntVar()
Checkbutton(root, text="Hindi").place(x=290,y=480)
var3 = IntVar()
Checkbutton(root, text="German").place(x=345,y=480)

label_9 = Label(root, text="Courses",width=20,font=("bold", 10))
label_9.place(x=73,y=530)

listed = ['C','C++','Java','C#','Python','Ruby'];
c=StringVar()
droplist=OptionMenu(root,c, *listed)
droplist.config(width=15)
c.set('Interested Course') 
droplist.place(x=240,y=530)

Button(root, text='Submit',width=20,bg='white',fg='black').place(x=100,y=580)
Button(root,command =reset_values, text='Reset',width=20,bg='white',fg='black').place(x=250,y=580)
root.mainloop()
