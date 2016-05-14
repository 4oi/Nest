/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.llv.nest.mod.kotlin;

import jp.llv.nest.module.Module;
import jp.llv.nest.module.ReqVer;

/**
 *
 * @author toyblocks
 */
@Module(name="kotlin-reflect", author = "toyblocks", version=1)
public class KotlinReflectModule {
    public KotlinReflectModule(@ReqVer(min = 1, max = 1) KotlinModule module) {
    }
}
