from flask import Flask
app = Flask(__name__)

@app.route("/")
def hello_world():
    return "Greeting service"

@app.route("/hello/<username>")
def hello_de(username):
    return "Hello " + username

@app.route("/hello")
def hello_help():
    return "Tell me your name please!"
