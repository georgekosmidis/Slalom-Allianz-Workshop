# Web Scraping and Data Visualization Project

1. **Set up your environment:**
   - Make sure Python is installed on your system. You can download it from the official Python website (https://www.python.org/downloads/windows/).
   - Download and install Visual Studio Code (VS Code) from its [official website](https://code.visualstudio.com/).
   - Open VS Code, go to the Extensions view by clicking on the square icon on the sidebar or pressing `Ctrl+Shift+X`, and install the Python extension for VS Code.

1. **Project setup:**
   - Create a new project folder and open it in VS Code.
   - Add a Python file, such as `scraper_visualizer.py`.

1. **Virtual environment:**
   - Open the terminal in VS Code (`Ctrl+` ` or View > Terminal).
   - Run `python -m venv venv` to create a virtual environment named `venv`.
   - Activate the virtual environment:
     - On Windows, run `.\venv\Scripts\activate`.
     - On macOS and Linux, run `source venv/bin/activate`.
   - Your terminal should now show the name of your virtual environment, indicating it's activated.

1. **Install libraries:**
   - Install BeautifulSoup for web scraping (`pip install beautifulsoup4`) and Plotly for interactive visualizations (`pip install plotly`).

1. **Coding the script:**
   - Start with imports:
     ```python
     from bs4 import BeautifulSoup
     import requests
     import plotly.express as px
     import pandas as pd
     ```
   - Use GitHub Copilot to draft your web scraping logic and data visualization. Begin with comments like:
     ```python
     # Scrape data from https://en.wikipedia.org/wiki/List_of_highest-grossing_films
     ```
   - Follow Copilot suggestions for scraping web content, processing data, and generating visualizations.

1. **Execution:**
   - Run your script to scrape data and generate visualizations. Adjust your code as needed based on the results.

1. **Next steps:**
   - Experiment with different data sources and visualization types. Use Copilot to explore more advanced scraping techniques and visualization options.
   - Try adding documentation and unit testing
