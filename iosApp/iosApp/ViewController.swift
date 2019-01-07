//
//  ViewController.swift
//  iosApp
//
//  Created by Jorge Sánchez on 16/11/18.
//  Copyright © 2018 xurxodev. All rights reserved.
//

import UIKit
import core_multiplatform

class ViewController: UIViewController {

    @IBOutlet weak var helloLabel: UILabel!
    
    override func viewDidLoad() {
        super.viewDidLoad()        
        
        let now = DateTime()
        
        helloLabel.text = "The time is: \(now.timestamp)"
    
    }

    
}

