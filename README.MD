# How to reproduce the issue in a Windows environment
1. Open a CMD window as administrator
2. Open a CMD window as user
3. On the administrator window, run `mvn test`
4. Shortly after, run `mvn test` in the user window

Only test running in user window should fail.

Note: After running `mvn test` on the first window, you'll have 10 seconds to run it on the other window.