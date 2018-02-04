

# CustomToast

![capture3](https://user-images.githubusercontent.com/35681498/35776859-3e5396f6-09ca-11e8-8450-a58af3ca7af5.PNG)
![capture2](https://user-images.githubusercontent.com/35681498/35776860-3fba02c8-09ca-11e8-82ba-1518bbb4655b.PNG)
![capture4](https://user-images.githubusercontent.com/35681498/35776861-401df12a-09ca-11e8-93f4-ded57ac359c7.PNG)

[![Android Arsenal]( https://img.shields.io/badge/Android%20Arsenal-CustomToast-green.svg?style=flat )]( https://android-arsenal.com/details/1/6719 )


# Step 1. Add the JitPack repository to your build file

allprojects {
  repositories {
   ...
   maven { url 'https://jitpack.io' }
  }
 }
 

# Step 2. Add the dependency in build.gradle file

dependencies {
         compile 'com.github.shelake-chetan:CustomToast:1.0.2'
 }

# Step 3. Initialise Custom Toast first

        private CustomToast customToast;
        customToast = new CustomToast(this); //pass context as parameter
                                       customToast.setTextColor(context.getResources().getColor(R.color.white));
        customToast.setBackground(context.getResources().getColor(R.color.app_color));



# Step 4. Show toast as error,success or network error

       customToast.showErrorToast("Some error occurred, please try again");

       customToast.showNetworkToast();

       customToast.showSuccessToast("I have successfully registered my interest");
