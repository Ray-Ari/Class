//
//  UpdateModel.swift
//  DBCRUD
//
//  Created by RayAri on 2021/07/28.
//

import Foundation

class UpdateModel: NSObject{
    var urlPath = "http://192.168.2.50:8080/ios/studentUpdate_ios.jsp"
    
    func updateItems(code: String, name: String, dept: String, phone: String) -> Bool{
        var result: Bool = true
        let urlAdd = "?code=\(code)&name=\(name)&dept=\(dept)&phone=\(phone)"
        urlPath = urlPath + urlAdd
        
        // 한글 url encoding
        urlPath = urlPath.addingPercentEncoding(withAllowedCharacters: CharacterSet.urlQueryAllowed)!
        
        let url:URL = URL(string: urlPath)!
        let defaultSession = URLSession(configuration: URLSessionConfiguration.default)
        let task = defaultSession.dataTask(with: url){(data, response, error) in
            if error != nil {
                print("Failed to download data")
                result = false
            }else{
                print("Data is downloaded")
                result = true
            }
        }
        task.resume()
        return result
    }
}
