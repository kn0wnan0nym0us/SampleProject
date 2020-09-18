

import 'package:flutter/material.dart';

class ScaffoldExample extends StatelessWidget {
  _tapButton() {
    debugPrint("Tapped Button");
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
        appBar: AppBar(
          title: Text("Scaffold"),
          centerTitle: false,
          backgroundColor: Colors.purpleAccent.shade700,
          actions: [
            IconButton(icon: Icon(Icons.email), onPressed: _tapButton),
            IconButton(icon: Icon(Icons.account_box), onPressed: _tapButton),
            IconButton(icon: Icon(Icons.add_a_photo), onPressed: _tapButton),
            IconButton(icon: Icon(Icons.add_call), onPressed: _tapButton),
          ],
        ),
        backgroundColor: Colors.indigo,
        body: Container(
          alignment: Alignment.center,
          child: Column(
            mainAxisAlignment: MainAxisAlignment.center,
            children: [
              CustomButton()

        //   InkWell(
        //   child: Text("Click Here",
        //     style: TextStyle(fontStyle: FontStyle.italic,
        //       fontSize: 25.0,
        //       fontWeight: FontWeight.bold,
        //     ),
        //   ),
        //
        //   onTap: () => debugPrint("tapped..."),
        // )
    ],
    )
    ,
    )
    ,
    );
  }
}

    class CustomButton extends StatelessWidget {
      @override
      Widget build(BuildContext context) {
        return GestureDetector(
          onTap: () {
            final snackBar = SnackBar(content: Text("Hello There!"),
            backgroundColor: Colors.indigo.shade700,);

            Scaffold.of(context).showSnackBar(snackBar);
          },
          child: Container(
            padding: EdgeInsets.all(10.0),
            decoration: BoxDecoration(
              color: Colors.greenAccent,
              borderRadius: BorderRadius.circular(8.0),
            ),
            child: Text("Click Here"),
          ),
        );
      }
    }
    final snackBar = SnackBarAction(label: Text., onPressed: null)

class Home extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return Material(
      color: Colors.cyanAccent,
      child: Center(
          child: Text("HEY FLUTTER!",
              textDirection: TextDirection.ltr,
              style: TextStyle(
                fontSize: 23.0,
                fontWeight: FontWeight.w700,
                fontStyle: FontStyle.italic,
              ))),
    );
  }
}
