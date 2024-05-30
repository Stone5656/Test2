package com.example.test2

import android.os.Bundle
import androidx.fragment.app.Fragment

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

class SeeMoreAttractions : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }



//    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
//        super.onViewCreated(view, savedInstanceState)
//
//        val container = view.findViewById<LinearLayout>(R.id.custom_view_container)
//
//        // データベースからデータを取得
//        val data = fetchDataFromDatabase()
//
//        // データに基づいてカスタムビューを追加
//        addCustomViews(container, data)
//    }

//    private fun fetchDataFromDatabase(): List<CustomData> {
//        // データベースからデータを取得するロジックを実装
//        // 例としてダミーデータを返す
//        return List(10) { index ->
//            CustomData(
//                textEn = "Text $index EN",
//                textJp = "テキスト $index JP",
//                imageResId = R.drawable.ic_launcher_foreground
//            )
//        }
//    }
//
//    private fun addCustomViews(container: LinearLayout, data: List<CustomData>) {
//        data.forEach { item ->
//            val customView = CustomView(requireContext()).apply {
//                setTextViewText(item.textEn) // または item.textJp
//                setButtonImage(item.imageResId)
//            }
//            container.addView(customView)
//        }
//    }
//
//    private fun updateResourceFiles(context: Context, data: List<CustomData>) {
//        val resDir = File(context.filesDir, "res")
//        if (!resDir.exists()) {
//            resDir.mkdir()
//        }
//
//        val enStrings = File(resDir, "values-en/strings.xml")
//        val jpStrings = File(resDir, "values-ja/strings.xml")
//
//        if (!enStrings.exists()) {
//            enStrings.parentFile.mkdirs()
//            enStrings.createNewFile()
//        }
//
//        if (!jpStrings.exists()) {
//            jpStrings.parentFile.mkdirs()
//            jpStrings.createNewFile()
//        }
//
//        enStrings.outputStream().use { fos ->
//            OutputStreamWriter(fos).use { writer ->
//                writer.write("<resources>\n")
//                data.forEachIndexed { index, item ->
//                    writer.write("    <string name=\"text_${index}_en\">${item.textEn}</string>\n")
//                }
//                writer.write("</resources>\n")
//            }
//        }
//
//        jpStrings.outputStream().use { fos ->
//            OutputStreamWriter(fos).use { writer ->
//                writer.write("<resources>\n")
//                data.forEachIndexed { index, item ->
//                    writer.write("    <string name=\"text_${index}_jp\">${item.textJp}</string>\n")
//                }
//                writer.write("</resources>\n")
//            }
//        }
//    }
}

//data class CustomData(val textEn: String, val textJp: String, val imageResId: Int)