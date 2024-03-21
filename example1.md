# Create a Simple Web App

1. **Install Node.js and VS Code:**
   - If not already installed, download and install Node.js from its [official website](https://nodejs.org/en/download/current).
   - Download and install Visual Studio Code (VS Code) from its [official website](https://code.visualstudio.com/).

1. **Set up your project:**
   - Create a new folder for your project
   - Open that folder in VS Code. You can do this by selecting `File` > `Open Folder` from the menu.
   - Go to `Terminal` > `New Terminal` from the top menu. This opens an integrated terminal within VS Code.
   - In the terminal, run `npm init -y`. This command creates a new `package.json` file with default settings in your project folder.
   - Still in the terminal, run `npm install express`. This command adds Express, a web application framework for Node.js, to your project.

1. **Create your web server file:**
   - In VS Code, create a new file in your project folder named `app.js`.
   - Open `app.js` and use it to start coding your web server. 
   - Try asking Github Copilot to suggest a Hello World app with `express` and `nodesj`
   - Here’s a simple example on what you should end up with:
     ```javascript
     const express = require('express');
     const app = express();
     const port = 3000;

     app.get('/', (req, res) => {
       res.send('Hello World!');
     });

     app.listen(port, () => {
       console.log(`Example app listening at http://localhost:${port}`);
     });
     ```
1. **Run your web app:**
   - Try asking Github Copilot how to run your hello world app.
   - That's what you should end up doing:
     - In the integrated terminal within VS Code, run `node app.js` to start the server.
     - Open your web browser and go to `http://localhost:3000` to view your app.
     - You should see the "Hello World!"

1. **Explore and expand with Copilot:**
   - Now that you have a basic setup, use GitHub Copilot in VS Code to explore adding new features to your web app.
   - Try adding more routes, incorporating a database, or integrating with external APIs.
   - Try asking Copilot to write the code that connects to an Azure Keyvault and retrieves a secret.
   - Then try asking Copilot to use that secret to authenticate against OpenAI
   - GitHub Copilot might automatically suggest completions as you type. You can accept these suggestions to speed up your coding.