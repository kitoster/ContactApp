# ContactApp
The Contacts App is a proposed app that can store various contacts and obtain fields such as name, birthdate, and phone number, constructed using SQLiteOpenHelper. The app also has an about page containing the app version, year, and information about how the app works. The app can also store the user’s name in SharedPreferences.

The SQLiteOpenHelper class contains two constructors and has many available methods, such as close(), which closes the database object, onCreate, which is used when the database is created, and onUpgrade, which is called when the database should be updated. 

The “insert data” button corresponds to a Boolean method that inserts the user data. The database is retrieved as writable and then the contentValues object is created so the values of name, contact, and dob can be inserted into the database. An if else exists at the end of the method in case the insertion fails. 

The next button option corresponds to another Boolean method that updates the data. The database is retrieved as writable, and a contentValues object is used to find and change the data. The delete method works in a similar fashion, except it removes the data where the name is applicable.

![contact1](https://user-images.githubusercontent.com/98862584/229208004-9c026867-ed08-4db3-a48a-9aa532d00795.PNG)

Below is an example of viewing the current entries:

![contact2](https://user-images.githubusercontent.com/98862584/229208472-3f805a05-4d82-4bec-b2d8-e5830a8b0039.PNG)

The app contains Toast messages displaying ideas for further development of the app. In the future, I would like to add a search function and change more of the app to use fragments. Fragments exist in sub-activities and are modular in design. They can be reused and replaced as needed. Before Fragments were introduced to Android Studio, only one activity could be shown on screen at a time - Fragments changed this, which added flexibility and options. In the context of the Contacts App, this could mean having a more optimized way to switch between certain displays, such as switching between the About and Help sections. 

Another proposed feature is that of a search function, which could search the SQLite database for records. This would require a text field where a user could input what they would like to search for. This could be accomplished by using an options menu for the UI, creating a query() method to search for matching words, and returning a cursor that shows the results. This may require differentiating between different fields to search for, and for this a filter on the search could be implemented. 




