

# CustomToast

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
