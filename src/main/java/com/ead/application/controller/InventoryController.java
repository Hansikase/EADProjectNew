package com.ead.application.controller;

import com.ead.application.domain.Engine;
<<<<<<< HEAD
import com.ead.application.domain.Stock;
import com.ead.application.service.EngineInventoryService;
import com.ead.application.service.StockInventoryService;
=======
import com.ead.application.service.EngineInventoryService;
>>>>>>> 47461b6ef9f18b97e908149a0ac51dae7337355a
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ModelAttribute;

/**
 * Created by anoukh on 11/20/15.
 */

@Controller
public class InventoryController {

//    private static final Logger logger = Logger.getLogger(InventoryController.class);

    @Autowired
<<<<<<< HEAD
    private StockInventoryService stockInventoryService;
    @Autowired
    private EngineInventoryService engineInventoryService;




=======
    private EngineInventoryService engineInventoryService;

>>>>>>> 47461b6ef9f18b97e908149a0ac51dae7337355a
    @RequestMapping("/inventory")
    public String listEngine(Model model){

//        logger.debug("Entered Controller");
        model.addAttribute("engines", engineInventoryService.getAvailableEngines());
<<<<<<< HEAD
        model.addAttribute("stocks", stockInventoryService.getAvailableStock());

=======
>>>>>>> 47461b6ef9f18b97e908149a0ac51dae7337355a

        return "inventory/inventory-home";
    }

    @RequestMapping(value="/postEngine", method= RequestMethod.POST)
    public String addNewEngine(@ModelAttribute Engine engine, Model model) {

        System.out.println(engine.getEngine_name());
        String temp = engineInventoryService.addNewEngine(engine);

        System.out.println(temp);

<<<<<<< HEAD
        return "redirect:/inventory";

    }

    @RequestMapping(value="/addWIP", method= RequestMethod.POST)
    public String addToStock(@ModelAttribute Stock stock, Model model1) {

        System.out.println(stock.getengine_id());
        String temp2 = stockInventoryService.addToStock(stock);

        System.out.println(temp2);

        return "redirect:/inventory";
=======
        return "inventory/inventory-home";
>>>>>>> 47461b6ef9f18b97e908149a0ac51dae7337355a

    }
}
