OpenShift gives you:
Server to run app
Auto scaling
Load balancing
Auto restart
CI/CD
Public URL


1️ Pod = Running Application
👉 Pod = one running instance of your app
Like: one Tomcat, one Spring MVC app
If pod dies → OpenShift creates new one automatically.

2 Deployment = Controller
Deployment decides: How many pods, How to update, How to rollback
Example: “Run 3 copies of my Spring app”

3 Service = Internal Load Balancer
Gives stable internal URL:
myapp-service:8080
Even if pods change → service remains same.

4️ Route = Public URL
Route = external link
Like: 👉 https://myapp-dev.apps.sandbox.com

5️⃣ BuildConfig / S2I
OpenShift can:
👉 Take your Git code
👉 Build container automatically
👉 Deploy
No Dockerfile needed = S2I (Source to Image)