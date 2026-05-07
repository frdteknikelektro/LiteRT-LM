// Copyright 2026 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//      http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.ai.edge.litertlm

/**
 * Per-turn options for [Conversation.sendMessage] and
 * [Conversation.sendMessageAsync].
 *
 * @param maxNumPatches Maximum number of image patches for vision processing.
 *   Controls the token budget tradeoff between inference speed and image
 *   accuracy. Typical values: 630, 1260, 2520, 5040, 10080 (corresponding to
 *   token budgets of 70, 140, 280, 560, 1120). Null uses the model default.
 */
data class SendOptions(
  val maxNumPatches: Int? = null,
)
