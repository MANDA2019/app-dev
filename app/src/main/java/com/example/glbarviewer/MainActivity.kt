/*package com.example.glbarviewer

import android.R.attr.onClick
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import android.R.attr.onClick
import android.widget.Toast


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ArButton {
                openArModel()
            }
        }
    }

    private fun openArModel() {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/MANDA2019/app-dev/raw/main/manda.glb"))
        intent.setDataAndType(intent.data, "model/gltf-binary")
        // Tu peux aussi essayer sans setPackage pour une compatibilité plus large

        if (intent.resolveActivity(packageManager) != null) {
            startActivity(intent)
        } else {
            // Si aucune application compatible n'est trouvée :
            // Redirige vers le Play Store pour ARCore (ou Scene Viewer)
            val playStoreIntent = Intent(Intent.ACTION_VIEW,
                Uri.parse("market://details?id=com.google.ar.core"))
            if (playStoreIntent.resolveActivity(packageManager) != null) {
                startActivity(playStoreIntent)
                Toast.makeText(
                    this,
                    "Veuillez installer l'application requise (ARCore ou Scene Viewer) pour afficher le modèle en AR.",
                    Toast.LENGTH_LONG
                ).show()
            } else {
                Toast.makeText(
                    this,
                    "Aucune application trouvée pour ouvrir ce lien ou installer ARCore.",
                    Toast.LENGTH_LONG
                ).show()
            }
        }
    }


}

@Composable
fun ArButton(onClick: () -> Unit) {
    Button(onClick = onClick) {
        Text("Voir en AR")
    }
}
*/
package com.example.glbarviewer

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import android.widget.Toast

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ArButton {
                openArModel()
            }
        }
    }

    private fun openArModel() {
        val modelUrl = "https://github.com/MANDA2019/app-dev/raw/main/manda.glb"
        val intent = Intent(Intent.ACTION_VIEW)
            .setDataAndType(Uri.parse(modelUrl), "model/gltf-binary")
            .addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        if (intent.resolveActivity(packageManager) != null) {
            startActivity(intent)
        } else {
            // Si jamais aucun viewer compatible n'est trouvé
            Toast.makeText(
                this,
                "Aucune application AR compatible trouvée pour ouvrir ce modèle.",
                Toast.LENGTH_LONG
            ).show()
        }

        /*val modelUrl = "https://github.com/MANDA2019/app-dev/raw/main/manda.glb"
        val intent = Intent(Intent.ACTION_VIEW)
            .setDataAndType(Uri.parse(modelUrl), "model/gltf-binary")
            .addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)

        // Ne force pas de package pour maximiser la compatibilité (Scene Viewer, autres viewers AR)
        if (intent.resolveActivity(packageManager) != null) {
            startActivity(intent)
        } else {
            // Fiche Play Store d'ARCore/Scene Viewer pour l'installation automatique
            val playStoreIntent = Intent(Intent.ACTION_VIEW,
                Uri.parse("https://play.google.com/store/apps/details?id=com.google.ar.core"))
                .addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            if (playStoreIntent.resolveActivity(packageManager) != null) {
                startActivity(playStoreIntent)
                Toast.makeText(
                    this,
                    "Veuillez installer Scene Viewer ou Google Play Services for AR pour visualiser le modèle en AR.",
                    Toast.LENGTH_LONG
                ).show()
            } else {
                Toast.makeText(
                    this,
                    "Impossible de trouver une application compatible ou d'accéder au Play Store.",
                    Toast.LENGTH_LONG
                ).show()*/
            }
        }



@Composable
fun ArButton(onClick: () -> Unit) {
    Button(onClick = onClick) {
        Text("Voir en AR")
    }
}




