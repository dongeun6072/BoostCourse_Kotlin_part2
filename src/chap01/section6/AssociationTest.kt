package chap01.section6

class Patient(val name: String){
    fun doctorList(d: Doctor){
        println("patient: $name , Doctor: ${d.name}")
    }
}

class Doctor(val name:String){
    fun patientList(p: Patient){
        println("Doctor: $name, Patient: ${p.name}")
    }
}

fun main() {
    val doc1 = Doctor("Kimsabu")
    val patient1 = Patient("Kildong")
    doc1.patientList(patient1)
    patient1.doctorList(doc1)
}