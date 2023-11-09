package com.example.travelplan

import androidx.recyclerview.widget.RecyclerView
import com.example.travelplan.databinding.ItemPlanBinding

class PlanViewHolder(val binding: ItemPlanBinding) : RecyclerView.ViewHolder(binding.root) {
    fun bindData(plan: Plan) {
        binding.destinationTv.setText(plan.destination)
        //todo date
    }
}