# Commands

**Compilation of all modules**
```bash
javac -d appmodules --module-source-path appsrc appsrc/appstart/appstart/mymodappdemo/MyModAppDemo.java
```

**Running the module**
```bash
java --module-path appmodules -m appstart/appstart.mymodappdemo.MyModAppDemo
```

**Compilation of individual module**
```bash
javac --module-path appmodules -d appmodules/appstart appsrc/appstart/module-info.java  appsrc /appstart/appstart/mymodappdemo/MyModAppDemo.java
```