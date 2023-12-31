# داک پروژه

در این قسمت به مستندات پروژه می‌پردازیم.
قسمت اول مربوط به اجرای دستور العمل و قسمت دوم مربوط به افزودن مسئله مطرح شده در آزمایش ۳ می‌باشد.
## BDD-1
در این پروژه ما ابتدا طبق دستور العملی که داده شده بود، مراحل را پیش بردیم و یک پروژه ساده ماشین حساب با یک عملیات جمع را زدیم که برای آن با استفاده از زبان Gherkins یک تست BDD نیز نوشتیم. پس از اینکه مرحله آخر دستور العمل را انجام دادیم با یک ارور در هنگام تست مواجه شدیم. طبق سوالات داک پیش می‌رویم و مشکل را شرح می‌دهیم.

### پرسش‌ها 
#### ۱. این موارد تست کدامند؟
تست‌هایی که حداقل یکی از اعداد منفی باشند دچار مشکل می‌شوند.

#### ۲. علت بروز مشکل چیست؟
در تعریف تابع Given و Then برای این calculator ، رجکسی که زده شده است تنها اعداد مثبت را قبول می‌کند و علامت منفی قبل از عدد برای آن تعریف نشده است.

#### ۳. چگونه آن را رفع کردید؟
کافی است که عبارات (\d+) در توابع Given و Then را با عبارت (-?\d+) تعویض کنیم تا اعداد منفی نیز پذیرفته شوند.



## BDD-2

حال در این قسمت با توجه به توضیحات داک آزمایش، باید ماشین حساب را طوری توسعه دهیم تا بتواند از محاسبه با عملیات نیز پشتیبانی کند.

### operator.feature
در این فایل که زیل فولدر test/resources/features قرار گرفته است، همانند مثال جمع در قسمت قبل با استفاده از زبان Gherkins سناریو‌های تست را نوشتیم. برای هر یک از عملیات‌ها یک سناریو و همچنین یک سناریو outline نیز به صورت پویا نوشته شده است.

### OperatorStepdefs

پس از اینکه سناریو‌های تست را نوشتیم، باید آن‌ها را تعریف کنیم تا بتوانیم تست فیچر را پیش ببریم. برای این کار یک کلاس با نام OperatorStepdefs در زیل فولدر test/java/operator قرار گرفته است. توجه کنید که این قسمت را از پکیج calculator که در قسمت قبل استفاده کردیم، جدا در نظر گرفتیم و یک پکیج مجزا برای‌ آن تعریف کردیم.

### Calculator

برای این که این فیچر به ماشین حسابمان اضافه شود، ۴تابع در این کلاس پیاده سازی کردیم. ۳تا برای عملیات‌های ضرب، تقسیم و توان و یکی نیز برای تشخیص دادن اپراتور ورودی ایجاد شده است.


### RunnerTest

حال برای استفاده از Cucumber نیز  یک رانر برای این تست قرار داده‌ایم. این رانر دقیقا مشابه قسمت قبل می‌باشد، فقط با این تفاوت که باید سورس تست را در این کلاس به test/resources/features/operator.feature تغییر دهیم تا با کانفلیکت مواجه نشویم و تست‌ها به درستی اجرا شوند.

#  اجرای پروژه 
 برای اجرای تست‌های نوشته شده، کافیست که به قسمت test/java/operator  یا test/java/calculator برویم و در کلاس RunnerTest دکمه اجرا را بزنیم. با این کار تست‌هایی که توسط رانر مربوطه پوشش داده می‌شوند، به درستی اجرا خواهند شد و نتیجه در کنسول قابل مشاهده می‌باشد.