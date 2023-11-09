import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.farmdoctor.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // activity_main을 화면에 표시
        setContentView(R.layout.activity_main)
    }
}
