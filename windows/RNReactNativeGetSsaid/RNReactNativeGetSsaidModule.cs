using ReactNative.Bridge;
using System;
using System.Collections.Generic;
using Windows.ApplicationModel.Core;
using Windows.UI.Core;

namespace React.Native.Get.Ssaid.RNReactNativeGetSsaid
{
    /// <summary>
    /// A module that allows JS to share data.
    /// </summary>
    class RNReactNativeGetSsaidModule : NativeModuleBase
    {
        /// <summary>
        /// Instantiates the <see cref="RNReactNativeGetSsaidModule"/>.
        /// </summary>
        internal RNReactNativeGetSsaidModule()
        {

        }

        /// <summary>
        /// The name of the native module.
        /// </summary>
        public override string Name
        {
            get
            {
                return "RNReactNativeGetSsaid";
            }
        }
    }
}
