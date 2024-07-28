package com.teamjeff.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.teamjeff.myapplication.adapters.ItemAdapter
import com.teamjeff.myapplication.adapters.notification_adapter
import com.teamjeff.myapplication.data.data_notification
import com.teamjeff.myapplication.data.data_offers



class HomeFragment : Fragment() {
    private lateinit var adapter: ItemAdapter
    private lateinit var recyclerView: RecyclerView
    private lateinit var offerlist: ArrayList<data_offers>

    lateinit var imageId: Array<Int>
    lateinit var description: Array<String>

    private lateinit var adapter2: notification_adapter
    private lateinit var recyclerView2: RecyclerView
    private lateinit var notificationlist: ArrayList<data_notification>

    lateinit var imageId2: Array<Int>
    lateinit var notification: Array<String>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        dataInit()
        val layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        recyclerView = view.findViewById(R.id.recyclerView)
        recyclerView.layoutManager = layoutManager
        recyclerView.setHasFixedSize(true)
        adapter = ItemAdapter(offerlist)
        recyclerView.adapter = adapter

        dataInit2()
        val layoutManager2 = LinearLayoutManager(context)
        recyclerView2 = view.findViewById(R.id.recyclerView2)
        recyclerView2.layoutManager = layoutManager2
        recyclerView2.setHasFixedSize(true)
        adapter2 = notification_adapter(notificationlist)
        recyclerView2.adapter = adapter2

    }


    private fun dataInit() {
        offerlist = arrayListOf<data_offers>()
        imageId = arrayOf(
            R.drawable.drone,
            R.drawable.drone,
            R.drawable.drone,
            R.drawable.drone,
        )

        description = arrayOf(
            "Drone",
            "Drone",
            "Drone",
            "Drone",
        )
        for (i in imageId.indices) {
            val offer = data_offers(imageId[i], description[i])
            offerlist.add(offer)
        }
    }

    private fun dataInit2() {
        notificationlist = arrayListOf<data_notification>()
        imageId2 = arrayOf(
            R.drawable.pngwingcom,
            R.drawable.pngwingcom,
            R.drawable.pngwingcom,
            R.drawable.pngwingcom,
        )

        notification = arrayOf(
            "Notification here",
            "Notification her",
            "Notification her",
            "Notification her",
        )
        for (i in imageId2.indices) {
            val noti = data_notification(imageId2[i], notification[i])
            notificationlist.add(noti)
        }
    }


}
