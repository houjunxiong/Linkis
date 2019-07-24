/*
 * Copyright 2019 WeBank
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.webank.wedatasphere.linkis.enginemanager

import com.webank.wedatasphere.linkis.enginemanager.event.EngineManagerEventListenerBus

/**
  * Created by johnnwang on 2018/9/6.
  */
abstract class EngineManagerContext {
  def getOrCreateEngineFactory: EngineFactory

  def getOrCreateResourceRequester: ResourceRequester

  def getOrCreateEngineCreator: EngineCreator

  def getOrCreateEngineResourceFactory: EngineResourceFactory

  def getOrCreateEngineHook: Array[EngineHook]

  def getOrCreateEventListenerBus: EngineManagerEventListenerBus
}