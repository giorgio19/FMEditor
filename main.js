'use strict';

const electron = require('electron');
const{remote, ipcRenderer} = require('electron');
const{app, BrowserWindow} = require('electron');


var mainWindow = null;

// Quit when all windows are closed.
app.on('window-all-closed', function() {
  // On macOS it is common for applications and their menu bar
  // to stay active until the user quits explicitly with Cmd + Q
  if (process.platform !== 'darwin') {
    app.quit();
  }
});

// This method will be called when Electron has finished
// initialization and is ready to create browser windows.
// Some APIs can only be used after this event occurs.
app.on('ready', function() {
  mainWindow = new BrowserWindow({
    'width': 800,
    'height': 600,
    'minWidth': 800,
    'minHeight': 600,
    'frame': false
  });
  //load the index.html
  mainWindow.loadFile('index.html');
  //open DevTools
  mainWindow.webContents.openDevTools();

  //emit when the window is closed
  mainWindow.on('closed', function() {
    // Dereference the window object, usually you would store windows
   // in an array if your app supports multi windows, this is the time
   // when you should delete the corresponding element.
   mainWindow = null;
 });
});


app.on('activate', () => {
  // On macOS it's common to re-create a window in the app when the
  // dock icon is clicked and there are no other windows open.
  if (mainWindow === null) {
    createWindow();
  }
});
