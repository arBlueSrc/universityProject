package ir.bluesource.q

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import ir.bluesource.q.model.Exp

class SharedViewModel : ViewModel() {

    val experisions = mutableListOf(
        Exp(1, "برای مشتری مهم است که در فرایند نصب دخالتی نداشته باشد. "),
        Exp(2, "عدم دخالت مشتری برای فرایند خرید و نقل و انتقال، به همراه نصب، اهمیت دارد."),
        Exp(3, "پیش بینی حمل سنگ برای طبقات با دسترسی سخت با تجهیزات بروز برای مشتری حائز اهمیت است. "),
        Exp(4, "انجام طرح سه بعدی کامپیوتری قبل از نصب برای مشتری سنگ لوکس، برای وی مهم است. "),
        Exp(5, "ارائه کیفیت خدمات فراتر از حداقل های خواسته شده، اهمیت دارد. "),
        Exp(6, "تعامل با مشتری از وقت خرید تا حمل و نصب، دارای اهمیت است."),
        Exp(7, "زمان، مهمترین عامل برای مشتری است. "),
        Exp(8, "کیفیت خدمات مهمترین عامل برای مشتری است."),
        Exp(9, "برای مشتری مهم است که سنگ، با طراحی خاص و غیرقابل تکرار باشد. "),
        Exp(10, "برای مشتری اهمیت دارد که دقیقا همان سنگ با همان طرح که پسند شده است، تهیه و نصب شود."),
        Exp(11, "مشاوره جهت تناسب نوع سنگ و محل استفاده ، باعث جلب مشتری می شود."),
        Exp(12, "مشتریان سنگ لوکس، این سنگ ها را متناسب با طراحی معماران تهیه میکنند و طراحی از قبل برای ایشان حائز اهمیت است. "),
        Exp(13, "سنگ دقیقا از همان نوع سنگ خریداری شده باشد، نمونه مشابه نباشد. "),
        Exp(14, "برند و نوع برای مشتری حائز اهمیت نیست. اولویت مشتری، زیبایی است. "),
        Exp(15, "برای مشتری مهم است که سنگ از چه کشوری و چه منطقه ای ارسال می شود."),
        Exp(16, "انتخاب تامین کننده با توجه به نمونه کارهای وی صورت می گیرد."),
        Exp(17, "مهمترین عامل برای خرید سنگ لوکس، قیمت است. "),
        Exp(18, "هرچه قیمت بالاتر باشد، مشتری سنگ لوکس رغبت بیشتری برای خرید دارد. "),
        Exp(19, "مشتری سنگ لوکس وقت کافی برای گشت و گذار و مقایسه قیمت دارد و این کار را انجام می دهد پس باید قیمت رقابتی باشد."),
        Exp(20, "ارائه خدمات حرفه ای با تجهیزات در فرایند نصب و اجرا، نشانه لوکس بودن سنگ می باشد و برای مشتری حائز اهمیت است. "),
        Exp(21, "استفاده از واحدهای پولی بجز ریال ( دلار ، یورو و ... ) در قراردادها و پروژه ها اهمیت دارد. "),
        Exp(22, "نصب سنگ لوکس باعث افزایش قیمت مسکن یا سازه می شود و این موضوع برای مشتریان مهم است. "),
        Exp(23, "عمر و استحکام سنگ لوکس بر زیبایی آن، برای مشتریان ارجحیت دارد."),
        Exp(24, "کیفیت سنگ مهمترین عامل برای مشتری است."),
        Exp(25, "ارتباطات و آشنا بودن افراد، یکی از عوامل موثر در خرید مشتری می باشد. "),
        Exp(26, "نصب سنگ با کیفیت به دلیل بالا بردن دوام ساختمان، نسبت به سایر مواد ( بلوک سیمانی ، پلاستیک و سنگ بی کیفیت ) برای مشتری اهمیت دارد. "),
        Exp(27, "دغدغه تامین سنگ برای پروژه، بر زیبایی سنگ برای مشتری ارجحیت دارد. "),
        Exp(28, "هزینه حمل کمتر حائز اهمیت است."),
        Exp(29, "ارائه سنگ در محل برای مشتری می تواند ارزش داشته باشد. "),
        Exp(30, "جانمایی سنگ با توجه به جنس و مرغوبیت آن مهم است. "),
        Exp(31, "استفاده از شبکه های اجتماعی برای معرفی سنگ ها و شناسایی سنگ ها برای مشتری حائز اهمیت است. "),
        Exp(32, "اجرای سریع تر و راحت تر سنگ نسبت به سایر متریال ها در ساختمان برای مشتری حائز اهمیت است. ")
    )

    val permissionCount = mutableListOf(
        Pair(-4,1),
        Pair(-3,3),
        Pair(-2,4),
        Pair(-1,5),
        Pair(0,6),
        Pair(1,5),
        Pair(2,4),
        Pair(3,3),
        Pair(4,1),
    )

    var name = ""
    var phone = ""
    var job = ""




}