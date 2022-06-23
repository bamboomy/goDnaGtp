package genetic;
import java.util.ArrayList;
class Thought66 extends Thought{
private static ArrayList<Thought66> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = true;
private double fd0 = 426.4211105990264;
private double fd1 = 830.4938882165955;
private Thought fo0 = null;
private Thought fo1 = null;
Thought66 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought66 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought66 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought66 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought66 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought66 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought66 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought66 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
fd0 = ad1; 
fd1 = ad2; 
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
public static Thought66 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought66 instance = new Thought66 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought66 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought66 instance = new Thought66 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought66 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought66 instance = new Thought66 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought66 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought66 instance = new Thought66 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought66 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought66 instance = new Thought66 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought66 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought66 instance = new Thought66 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought66 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought66 instance = new Thought66 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought66 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought66 instance = new Thought66 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
void m1() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo0.m2(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2();
}
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
    fb0 = fd1 > fd0;
    fb1 = fd1 < fd0;
    fd1 = fd0 + fd1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
    fb0 = fd0 < fd1;
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
}
Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
    boolean lb0 = true;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
    fb0 = fb1 && lb0;
    ab1 = fd0 < fd1;
    ab2 = ab3 && ab4;
    fd0 = fd1 - fd0;
    Thought lo1 = Thought24.getInstance(fd1, fd0, fd1, fd0, fb0, fb1, lb0, ab1);
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, lb0, ab1, ab2, ab3);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, ab4, fb0, fb1, lb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fd0 = fd1 + fd0;
    boolean lb2 = false;
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1, lb2, ab1, ab2, ab3);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4(ab4, fb0, fb1, lb0);
}
if(fo1 != null){
      lb2 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    Output.points[1][1] -= fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, lb0, lb2);
}
    Output.points[1][2] -= fd0;
    Output.points[1][3] -= fd1;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 - ad3;
    fb0 = fb1 && fb0;
    fb1 = !fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb1 = !fb0;
    fb1 = fb0 || fb1;
    double ld0 = 449.51161184966617;
    Thought lo1 = Thought51.getInstance(ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
    ld0 = ad1 + ad2;
    fb0 = fb1 || fb0;
    ad3 *= -1;
    ad4 = fd0 + fd1;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo0 != null){
      fo1 = fo0.m4(ld0, ad1, ad2, ad3);
}
if(fo1 != null){
      fo1.m1(fb1, fb0, fb1, fb0);
}

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = ab3 || ab4;
    double ld0 = 175.22387624304773;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld0, ad1, ad2, ad3);
}
    fb0 = ad4 > fd0;
    fd1 = ld0 + ad1;
    ad2 = ad3 - ad4;
    Thought lo1 = Thought68.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ld0, ad1, fb1, ab1, ab2, ab3);
    for(int i0=0; i0<10; i0++){
        Thought lo2 = Thought15.getInstance(fo0, fo1, fo0, fo1, ab4, fb0, fb1, ab1);
if(fo0 != null){
          ab2 = fo0.m2(fo1, fo0, fo1, fo0);
}
}
Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[1][4] -= fd0;
    fd1 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = fd0 < fd1;
    Output.points[1][5] -= fd0;
    boolean lb0 = true;
    fb0 = fb1 && lb0;
    fd1 = fd0 + fd1;
if(ao4 != null){
      fd0 = ao4.m3();
}
    Thought lo1 = Thought47.getInstance(fd1, fd0, fd1, fd0);
    fb0 = fd1 > fd0;
if(fo1 != null){
      fo0 = fo1.m4(fb1, lb0, fb0, fb1);
}
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo1.m2(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 *= -1;
    fb1 = ad3 < ad4;
    fd0 = fd1 - ad1;
    if (fb0) {
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
        ad2 = ad3 + ad4;
        fb1 = fd0 < fd1;
        fb0 = ad1 > ad2;
        ad3 *= -1;
if(ao2 != null){
          ao1 = ao2.m4(ad4, fd0, fd1, ad1, fb1, fb0, fb1, fb0);
}
        double ld0 = 636.3346191710659;
if(ao4 != null){
          ao3 = ao4.m4();
}
if(fo1 != null){
          fo0 = fo1.m4(ad1, ad2, ad3, ad4);
}
        fd0 *= -1;
        fb1 = fd1 > ld0;
        Output.points[1][6] += ad1;
        fb0 = ad2 > ad3;
if(ao2 != null){
          ao1 = ao2.m4(fb1, fb0, fb1, fb0);
}
        fb1 = !fb0;
        fb1 = ad4 > fd0;
        fb0 = !fb1;
        fb0 = fd1 > ld0;
        for(int i0=0; i0<10; i0++){
            ad1 = ad2 + ad3;
if(ao4 != null){
              ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad4, fd0, fd1, ld0);
}
            boolean lb1 = false;
if(ao4 != null){
              ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4, fb0, fb1, lb1, fb0);
}
            Output.points[1][7] -= fd0;
}}
Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[1][8] -= fd0;
    fd1 = fd0 + fd1;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, ab1, ab2, ab3, ab4);
}
    fd0 = fd1 - fd0;
    boolean lb0 = true;
    fd1 = fd0 + fd1;
    fd0 = fd1 - fd0;
    fd1 = fd0 + fd1;
if(fo1 != null){
      fd0 = fo1.m3(ao1, ao2, ao3, ao4);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, ab4, fb0, fb1, lb0);
}
if(ao2 != null){
      ao1 = ao2.m4();
}
    fd1 = fd0 + fd1;
    fd0 = fd1 + fd0;
if(ao4 != null){
      ao3 = ao4.m4(fd1, fd0, fd1, fd0);
}
    double ld1 = 438.03201116516;
    fd0 *= -1;
    Thought lo2 = Thought12.getInstance(ab1, ab2, ab3, ab4);
    for(int i0=0; i0<10; i0++){
        Thought lo3 = Thought19.getInstance(fo0, fo1, ao1, ao2, fd1, ld1, fd0, fd1);
        fb0 = ld1 < fd0;
        fd1 = ld1 - fd0;
        boolean lb4 = true;
if(ao3 != null){
          ao3.m3(ao4, fo0, fo1, ao1, fd1, ld1, fd0, fd1, fb0, fb1, lb4, lb0);
}
        ab1 = ld1 < fd0;
        double ld5 = 832.3938101656938;
        Thought lo6 = Thought54.getInstance(ao2, ao3, ao4, fo0, ab2, ab3, ab4, fb0);
        double ld7 = 244.61063972883613;
        boolean lb8 = false;
}
Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 + ad3;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    ad4 *= -1;
    ab1 = ab2 && ab3;
if(ao2 != null){
      ao2.m3(fd0, fd1, ad1, ad2, ab4, fb0, fb1, ab1);
}
    ab2 = ad3 < ad4;
if(ao3 != null){
      fd0 = ao3.m3();
}
    fd1 *= -1;
    Thought lo0 = Thought42.getInstance(ad1, ad2, ad3, ad4);
    ab3 = ab4 || fb0;
    fd0 *= -1;
if(fo0 != null){
      ao4 = fo0.m4(fb1, ab1, ab2, ab3);
}
    Output.points[2][0] += fd1;
if(fo1 != null){
      fo1.m2(ao1, ao2, ao3, ao4, ad1, ad2, ad3, ad4);
}
    fd0 = fd1 + ad1;
    boolean lb1 = false;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
}
    double ld2 = 769.8819892036071;
    Thought lo3 = Thought79.getInstance(fo0, fo1, ao1, ao2, lb1, ab1, ab2, ab3);
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1);
}
    ab4 = fd0 < fd1;
    fb0 = fb1 && lb1;
    double ld4 = 750.1087803136854;
if(ao2 != null){
      ab1 = ao2.m2(ld2, ld4, ad1, ad2, ab2, ab3, ab4, fb0);
}
    fb1 = !lb1;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
boolean m2() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fb0 || fb1;
    fb0 = fd0 < fd1;
    fd0 = fd1 + fd0;
    if (fb1) {
        fd1 *= -1;
        boolean lb0 = true;
        Output.points[2][1] += fd0;
        boolean lb1 = false;
        boolean lb2 = true;
        fd1 = fd0 - fd1;
if(fo1 != null){
          fo0 = fo1.m4();
}
        fd0 = fd1 - fd0;
        lb0 = fd1 < fd0;
if(fo1 != null){
          fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
        lb1 = fd1 < fd0;
        boolean lb3 = false;
        boolean lb4 = true;
        } else {
        Output.points[2][2] += fd1;
if(fo1 != null){
          fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
          fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
          fd0 = fo1.m3(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
        fd1 = fd0 + fd1;
        fb1 = !fb0;
        fb1 = fd0 < fd1;
}
Thought.STACK_COUNTER++;
return fb0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    Thought lo0 = Thought52.getInstance(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
    fb1 = !ab1;
    double ld1 = 157.03921945997456;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      ld1 = fo0.m3(fd0, fd1, ld1, fd0);
}
    fd1 = ld1 + fd0;
    if (ab2) {
if(fo0 != null){
          fo1 = fo0.m4(ab3, ab4, fb0, fb1);
}
        Thought lo2 = Thought19.getInstance(fo1, fo0, fo1, fo0, fd1, ld1, fd0, fd1);
        ld1 = fd0 + fd1;
        ab1 = ab2 && ab3;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld1, fd0, fd1, ld1, ab4, fb0, fb1, ab1);
}
        ab2 = ab3 || ab4;
        Output.points[2][3] -= fd0;
        fd1 *= -1;
        ld1 = fd0 - fd1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, ab1, ab2);
}
        ab3 = ab4 || fb0;
        fb1 = ab1 || ab2;
if(fo1 != null){
          fo1.m2(fo0, fo1, fo0, fo1);
}
        double ld3 = 638.6042053810824;
        boolean lb4 = false;
        ab2 = ld3 > ld1;
        double ld5 = 918.4070388438431;
if(fo1 != null){
          fo0 = fo1.m4(ld1, fd0, fd1, ld3, ab3, ab4, fb0, fb1);
}
}
Thought.STACK_COUNTER++;
return ab1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = !fb0;
    boolean lb0 = true;
    Thought lo1 = Thought72.getInstance();
    Thought lo2 = Thought8.getInstance(ad2, ad3, ad4, fd0);
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, lb0, fb0);
}
    double ld3 = 34.580536498720825;
    fb1 = fd0 < fd1;
    ld3 = ad1 - ad2;
    Output.points[2][4] += ad3;
    ad4 = fd0 - fd1;
    boolean lb4 = false;
    boolean lb5 = true;
    lb0 = ld3 > ad1;
    lb4 = lb5 || fb0;

Thought.STACK_COUNTER++;
return fb1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 731.8341444334703;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld0, ad1, ad2, ad3);
}
    ab1 = !ab2;
if(fo0 != null){
      ab3 = fo0.m2(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld0, ab4, fb0, fb1, ab1);
}
    ab2 = ad1 > ad2;
    ab3 = !ab4;
    boolean lb1 = true;
    ab4 = ad3 > ad4;
    fb0 = fd0 < fd1;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fb1, lb1, ab1, ab2);
}
    ab3 = ld0 > ad1;

Thought.STACK_COUNTER++;
return ab4;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = !fb0;
    Thought lo0 = Thought48.getInstance(ao1, ao2, ao3, ao4);
    boolean lb1 = false;
    fd0 = fd1 - fd0;
if(fo0 != null){
      fo0.m3(fd1, fd0, fd1, fd0, fb0, fb1, lb1, fb0);
}
    fb1 = lb1 && fb0;
    fb1 = fd1 > fd0;
    for(int i0=0; i0<10; i0++){
        lb1 = fd1 > fd0;
        fd1 *= -1;
        Output.points[2][5] -= fd0;
        fd1 = fd0 - fd1;
if(fo1 != null){
          fd0 = fo1.m3();
}
        Thought lo2 = Thought25.getInstance(fd1, fd0, fd1, fd0);
        fb0 = fd1 < fd0;
        if (fb1) {
            Thought lo3 = Thought34.getInstance(lb1, fb0, fb1, lb1);
            fd1 = fd0 + fd1;
            double ld4 = 571.7574978843815;
            Output.points[2][6] -= ld4;
if(ao2 != null){
              ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, ld4, fd0);
}
            boolean lb5 = true;
if(ao2 != null){
              ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, ld4, fd0, fd1, lb1, fb0, fb1, lb5);
}
}}
Thought.STACK_COUNTER++;
return fb0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = ad1 < ad2;
    double ld0 = 852.7352750824298;
    fb1 = !fb0;
    fb1 = fb0 || fb1;
    ad2 = ad3 + ad4;
    fd0 *= -1;
    fb0 = fb1 && fb0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fd1 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    fb1 = fb0 || fb1;
    Output.points[2][7] -= ld0;
    fb0 = ad1 < ad2;
    double ld1 = 51.4320894821239;
    Output.points[2][8] += ad2;
    Thought lo2 = Thought39.getInstance(ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);

Thought.STACK_COUNTER++;
return fb1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
if(ao2 != null){
      ao1 = ao2.m4();
}
    fd0 *= -1;
if(ao4 != null){
      ao3 = ao4.m4(fd1, fd0, fd1, fd0);
}
    lb0 = ab1 && ab2;
    ab3 = fd1 < fd0;
    Thought lo1 = Thought40.getInstance(ab4, fb0, fb1, lb0);
    fd1 *= -1;
    ab1 = fd0 < fd1;
    Thought lo2 = Thought43.getInstance(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1);

Thought.STACK_COUNTER++;
return ab2;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ad1 = ao1.m3(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
    double ld0 = 221.5704262602838;
if(fo1 != null){
      fb1 = fo1.m2(ao1, ao2, ao3, ao4, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
    Thought lo1 = Thought48.getInstance(fd0, fd1, ld0, ad1, fb0, fb1, ab1, ab2);
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          fo0.m2();
}
        ab3 = ab4 || fb0;
if(fo1 != null){
          fb1 = fo1.m2(ad2, ad3, ad4, fd0);
}
        ab1 = fd1 < ld0;
        ab2 = ad1 > ad2;
if(ao1 != null){
          ad3 = ao1.m3(ab3, ab4, fb0, fb1);
}
        Thought lo2 = Thought48.getInstance(ao2, ao3, ao4, fo0, ad4, fd0, fd1, ld0);
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
        fd0 *= -1;
        fd1 *= -1;
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0, fb0, fb1, ab1, ab2);
}
        ab3 = ab4 && fb0;
        boolean lb3 = false;
}
Thought.STACK_COUNTER++;
return fb1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 + fd0;
    fd1 *= -1;
    fd0 = fd1 - fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    boolean lb0 = true;
    boolean lb1 = false;
    Thought lo2 = Thought16.getInstance(fd1, fd0, fd1, fd0, lb0, lb1, fb0, fb1);
    fd1 *= -1;
    lb0 = lb1 && fb0;
    double ld3 = 249.64819915483696;
    fb1 = !lb0;
    boolean lb4 = false;
    ld3 = fd0 + fd1;
if(fo1 != null){
      lb1 = fo1.m2();
}

Thought.STACK_COUNTER++;
return ld3;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ab2 || ab3;
    fd1 *= -1;
if(fo0 != null){
      ab4 = fo0.m2(fd0, fd1, fd0, fd1);
}
    Thought lo0 = Thought40.getInstance(fb0, fb1, ab1, ab2);
    boolean lb1 = true;
    if (ab2) {
        double ld2 = 786.5601933008309;
        ab3 = ab4 && fb0;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld2, fd0, fd1, ld2);
}
if(fo1 != null){
          fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ld2, fd0, fb1, lb1, ab1, ab2);
}
        ab3 = fd1 > ld2;
        ab4 = fd0 < fd1;
        Thought lo3 = Thought48.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, lb1, ab1);
        ab2 = ab3 || ab4;
        fb0 = ld2 < fd0;
        } else if (fb1) {
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
        lb1 = fd0 < fd1;
if(fo0 != null){
          fd0 = fo0.m3(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
          fo1 = fo0.m4();
}
if(fo0 != null){
          fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
        Output.points[3][0] -= fd1;
if(fo1 != null){
          fo1.m1(fb0, fb1, lb1, ab1);
}
        ab2 = ab3 && ab4;
        Thought lo4 = Thought64.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
Thought.STACK_COUNTER++;
return fd0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought84.getInstance(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
    double ld1 = 206.27530449346608;
    boolean lb2 = true;
    boolean lb3 = true;
    lb3 = fd0 < fd1;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fb1, lb2, lb3, fb0);
}
if(fo1 != null){
      ld1 = fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m2(ad1, ad2, ad3, ad4, fb1, lb2, lb3, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    if (fb1) {
        lb2 = lb3 && fb0;
        fb1 = lb2 && lb3;
        double ld4 = 139.5138912391696;
        Thought lo5 = Thought71.getInstance(ad4, fd0, fd1, ld4);
        ld1 *= -1;
        boolean lb6 = true;
        ad1 = ad2 + ad3;
        Thought lo7 = Thought0.getInstance(lb3, fb0, fb1, lb6);
}
Thought.STACK_COUNTER++;
return fd0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2, ab2, ab3, ab4, fb0);
}
    boolean lb0 = false;
    ad3 = ad4 + fd0;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, lb0, ab1);
}
    ab2 = ab3 && ab4;
    boolean lb1 = true;
    ab4 = fb0 && fb1;
    lb0 = !lb1;
    Output.points[3][1] += ad1;
    ab1 = !ab2;
    ad2 *= -1;
    ab3 = ab4 && fb0;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      ad3 = fo1.m3(ad4, fd0, fd1, ad1, lb0, lb1, ab1, ab2);
}
if(fo0 != null){
      ab3 = fo0.m2();
}
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(ab4, fb0, fb1, lb0);
}
    boolean lb2 = false;
    fd1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
    Output.points[3][2] -= fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3, lb1, lb2, ab1, ab2);
}
    boolean lb3 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
    ad4 = fd0 - fd1;
if(fo1 != null){
      ad1 = fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m1(ad2, ad3, ad4, fd0, fb1, lb0, lb1, lb2);
}
    fd1 = ad1 - ad2;

Thought.STACK_COUNTER++;
return ad3;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4();
}
    Thought lo0 = Thought44.getInstance(fd1, fd0, fd1, fd0);
if(ao4 != null){
      ao4.m2(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1);
}
    fb1 = fb0 && fb1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fd0 = fd1 + fd0;
    fb0 = !fb1;
    fb0 = !fb1;
    fb0 = fd1 < fd0;
if(ao4 != null){
      fb1 = ao4.m2(fo0, fo1, ao1, ao2, fb0, fb1, fb0, fb1);
}
    boolean lb1 = false;
if(ao3 != null){
      lb1 = ao3.m2(ao4, fo0, fo1, ao1);
}
if(ao3 != null){
      ao2 = ao3.m4(fd1, fd0, fd1, fd0, fb0, fb1, lb1, fb0);
}
if(fo0 != null){
      ao4 = fo0.m4();
}
    Output.points[3][3] -= fd1;
    Thought lo2 = Thought9.getInstance(fd0, fd1, fd0, fd1);
if(ao1 != null){
      fo1 = ao1.m4(fb1, lb1, fb0, fb1);
}
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
    lb1 = fb0 || fb1;
    double ld3 = 952.6799694871241;
        Output.points[3][4] -= ld3;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, fd0, fd1, ld3, fd0, lb1, fb0, fb1, lb1);
}
if(fo1 != null){
      fo1.m3(ao1, ao2, ao3, ao4, fb0, fb1, lb1, fb0);
}
    fb1 = fd1 < ld3;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
    double ld4 = 969.3687021817677;

Thought.STACK_COUNTER++;
return ld4;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought99.getInstance(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
    boolean lb1 = true;
    lb1 = fd0 > fd1;
if(ao1 != null){
      ao1.m1();
}
if(ao3 != null){
      ao2 = ao3.m4(ad1, ad2, ad3, ad4);
}
    boolean lb2 = false;
        fd0 = fd1 + ad1;
    lb2 = fb0 && fb1;
    Thought lo3 = Thought33.getInstance(lb1, lb2, fb0, fb1);
    lb1 = lb2 || fb0;
if(ao4 != null){
      ad2 = ao4.m3(fo0, fo1, ao1, ao2, ad3, ad4, fd0, fd1);
}
    ad1 = ad2 - ad3;
    boolean lb4 = false;

Thought.STACK_COUNTER++;
return ad4;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    double ld0 = 371.825648781073;
    fb1 = ab1 && ab2;
if(fo1 != null){
      fd0 = fo1.m3(ao1, ao2, ao3, ao4, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
if(fo0 != null){
      fd1 = fo0.m3(ld0, fd0, fd1, ld0, ab1, ab2, ab3, ab4);
}
if(ao1 != null){
      fo1 = ao1.m4();
}
    Thought lo1 = Thought79.getInstance(fd0, fd1, ld0, fd0);
if(ao2 != null){
      ao2.m3(fb0, fb1, ab1, ab2);
}
    fd1 = ld0 + fd0;
    ab3 = fd1 < ld0;
    ab4 = fb0 && fb1;

Thought.STACK_COUNTER++;
return fd0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ad1 > ad2;
    ab2 = ab3 && ab4;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1);
}
    double ld0 = 650.1077563406866;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, ld0, ad1, ad2, ad3, fb0, fb1, ab1, ab2);
}
    ab3 = ad4 > fd0;
if(fo1 != null){
      fd1 = fo1.m3(ao1, ao2, ao3, ao4, ab4, fb0, fb1, ab1);
}
if(fo0 != null){
      ld0 = fo0.m3(fo1, ao1, ao2, ao3);
}
if(fo0 != null){
      ao4 = fo0.m4(ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
    for(int i0=0; i0<10; i0++){
        fb1 = ab1 || ab2;
        if (ab3) {
            boolean lb1 = true;
            if (ab3) {
if(fo1 != null){
                  fd0 = fo1.m3();
}
                double ld2 = 850.1202356715969;
                fd0 = fd1 + ld2;
if(ao2 != null){
                  ao1 = ao2.m4(ld0, ad1, ad2, ad3);
}
                ab4 = ad4 < fd0;
                fb0 = fb1 && lb1;
                ab1 = fd1 > ld2;
                ab2 = ld0 > ad1;
                Thought lo3 = Thought60.getInstance(ab3, ab4, fb0, fb1);
                boolean lb4 = false;
                lb4 = !lb1;
if(ao4 != null){
                  ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad2, ad3, ad4, fd0);
}
if(ao4 != null){
                  ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, ld2, ld0, ad1, ab1, ab2, ab3, ab4);
}
                boolean lb5 = false;
if(ao4 != null){
                  ao3 = ao4.m4(fo0, fo1, ao1, ao2, ab4, fb0, fb1, lb4);
}
}}}
Thought.STACK_COUNTER++;
return ad3;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 - fd0;
    double ld0 = 223.46976287954212;
    fd0 *= -1;
    boolean lb1 = false;
    fb0 = fd1 < ld0;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fd0 = fo1.m3(fd1, ld0, fd0, fd1, fb1, lb1, fb0, fb1);
}
    lb1 = ld0 < fd0;
    double ld2 = 780.0376136999042;
    fb0 = fb1 && lb1;
    Thought lo3 = Thought85.getInstance();
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld0, ld2);
}
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, lb1, fb0);
}
    fb1 = lb1 && fb0;
    Output.points[3][5] -= fd0;
    Thought lo4 = Thought13.getInstance(fo0, fo1, fo0, fo1, fd1, ld0, ld2, fd0);

Thought.STACK_COUNTER++;
return fo0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ab2 || ab3;
    Thought lo0 = Thought22.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, ab4, fb0, fb1, ab1);
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
    boolean lb1 = false;
    Thought lo2 = Thought66.getInstance(fo0, fo1, fo0, fo1);
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb0, fb1, lb1, ab1);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      ab2 = fo0.m2(fd1, fd0, fd1, fd0);
}
    ab3 = ab4 || fb0;
    fb1 = lb1 || ab1;
    fd1 = fd0 + fd1;
    boolean lb3 = false;
    boolean lb4 = true;
if(fo0 != null){
      fo1 = fo0.m4(lb4, ab1, ab2, ab3);
}
    ab4 = fd0 > fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    boolean lb5 = false;
    double ld6 = 253.07307262606523;
if(fo1 != null){
      ld6 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ld6, fd0, ab4, fb0, fb1, lb1);
}
        fd1 *= -1;
if(fo0 != null){
      lb3 = fo0.m2(fo1, fo0, fo1, fo0, lb4, lb5, ab1, ab2);
}
    Thought lo7 = Thought70.getInstance(fo1, fo0, fo1, fo0);
    Output.points[3][6] -= ld6;
    fd0 = fd1 - ld6;
    ab3 = !ab4;
    Output.points[3][7] += fd0;
if(fo1 != null){
      fb0 = fo1.m2(fd1, ld6, fd0, fd1, fb1, lb1, lb3, lb4);
}
if(fo0 != null){
      ld6 = fo0.m3();
}

Thought.STACK_COUNTER++;
return fo1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo0.m3(ad2, ad3, ad4, fd0);
}
    fd1 *= -1;
if(fo1 != null){
      fb1 = fo1.m2(fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
    Thought lo0 = Thought18.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2, fb0, fb1, fb0, fb1);
    fb0 = ad3 < ad4;
    boolean lb1 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ad1, ad2, fb1, lb1, fb0, fb1);
}
    lb1 = fb0 && fb1;
    lb1 = !fb0;
    ad3 = ad4 + fd0;
if(fo1 != null){
      fo0 = fo1.m4();
}
    Thought lo2 = Thought63.getInstance(fd1, ad1, ad2, ad3);
    Thought lo3 = Thought55.getInstance(fb1, lb1, fb0, fb1);
    lb1 = fb0 || fb1;
    Thought lo4 = Thought49.getInstance(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1);
    boolean lb5 = true;
    lb1 = ad2 > ad3;
if(fo0 != null){
      lb5 = fo0.m2(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1, fb0, fb1, lb1, lb5);
}
    double ld6 = 724.874109441471;

Thought.STACK_COUNTER++;
return fo1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought83.getInstance(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
    ad2 = ad3 + ad4;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
    fd0 *= -1;
    double ld1 = 673.0092586707335;
    boolean lb2 = true;
    Thought lo3 = Thought57.getInstance(fd0, fd1, ld1, ad1, fb0, fb1, lb2, ab1);
    ab2 = ab3 || ab4;
if(fo0 != null){
      fo1 = fo0.m4();
}
    ad2 *= -1;
    fb0 = !fb1;
    boolean lb4 = false;
    ad3 *= -1;
    lb2 = lb4 || ab1;
    ad4 *= -1;

Thought.STACK_COUNTER++;
return fo1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 = fd0 - fd1;
    double ld0 = 224.76611193285416;
if(ao2 != null){
      ao1 = ao2.m4(ld0, fd0, fd1, ld0);
}
    fb1 = fb0 || fb1;
    Output.points[3][8] -= fd0;
    double ld1 = 211.34356266455313;
    fd0 = fd1 + ld0;
if(ao4 != null){
      ao3 = ao4.m4(fb0, fb1, fb0, fb1);
}
    ld1 *= -1;
    fd0 = fd1 + ld0;
    fb0 = fb1 || fb0;
    fb1 = fb0 || fb1;
    boolean lb2 = false;
    Thought lo3 = Thought11.getInstance(fo0, fo1, ao1, ao2, ld1, fd0, fd1, ld0);
    boolean lb4 = true;
if(ao3 != null){
      lb2 = ao3.m2(ao4, fo0, fo1, ao1, ld1, fd0, fd1, ld0, lb4, fb0, fb1, lb2);
}
    lb4 = !fb0;

Thought.STACK_COUNTER++;
return ao2;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
if(ao1 != null){
      fb0 = ao1.m2(ao2, ao3, ao4, fo0, fb1, lb0, fb0, fb1);
}
    ad2 = ad3 + ad4;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    lb0 = fb0 && fb1;
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, ad1, ad2, lb0, fb0, fb1, lb0);
}
    ad3 *= -1;
    ad4 = fd0 + fd1;
if(ao2 != null){
      ao2.m2();
}
    fb0 = ad1 < ad2;
    ad3 = ad4 - fd0;

Thought.STACK_COUNTER++;
return ao3;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 32.45210120644162;
    fd0 = fd1 + ld0;
    Thought lo1 = Thought78.getInstance(fd0, fd1, ld0, fd0);
if(ao2 != null){
      fd1 = ao2.m3(ab1, ab2, ab3, ab4);
}
    fb0 = ld0 < fd0;
    Output.points[4][0] -= fd1;
    fb1 = ab1 || ab2;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ld0, fd0, fd1, ld0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, ld0, fd0, ab3, ab4, fb0, fb1);
}
if(ao3 != null){
      fd1 = ao3.m3(ao4, fo0, fo1, ao1, ab1, ab2, ab3, ab4);
}
    ld0 *= -1;
    fd0 = fd1 - ld0;
    double ld2 = 140.55470861907548;
    ld2 *= -1;
    if (fb0) {
        boolean lb3 = false;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
        boolean lb4 = true;
if(ao2 != null){
          ao2.m1(fd0, fd1, ld0, ld2, ab4, fb0, fb1, lb3);
}
if(ao4 != null){
          ao3 = ao4.m4();
}
        lb4 = ab1 || ab2;
        Output.points[4][1] -= fd0;
if(fo1 != null){
          fo0 = fo1.m4(fd1, ld0, ld2, fd0);
}
}
Thought.STACK_COUNTER++;
return ao1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought97.getInstance(ab1, ab2, ab3, ab4);
    fb0 = ad2 > ad3;
    boolean lb1 = true;
    fb0 = ad4 < fd0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, ad1, ad2, ad3);
}
        Thought lo2 = Thought49.getInstance(ao2, ao3, ao4, fo0, ad4, fd0, fd1, ad1, fb1, lb1, ab1, ab2);
    ab3 = ab4 && fb0;
if(fo1 != null){
      fo1.m3(ao1, ao2, ao3, ao4, fb1, lb1, ab1, ab2);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
    ab3 = ad2 > ad3;
if(fo0 != null){
      ad4 = fo0.m3(fd0, fd1, ad1, ad2, ab4, fb0, fb1, lb1);
}
if(fo1 != null){
      fo1.m3();
}
if(ao1 != null){
      ad3 = ao1.m3(ad4, fd0, fd1, ad1);
}
    ad2 = ad3 - ad4;
    fd0 = fd1 + ad1;
if(ao3 != null){
      ao2 = ao3.m4(ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad2, ad3, ad4, fd0);
}
    fb0 = !fb1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, ad1, ad2, ad3, lb1, ab1, ab2, ab3);
}
    ab4 = fb0 && fb1;
        ad4 *= -1;
    lb1 = fd0 > fd1;
    ad1 = ad2 + ad3;
    ab1 = ad4 > fd0;
    fd1 = ad1 - ad2;
    ab2 = !ab3;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ab4, fb0, fb1, lb1);
}

Thought.STACK_COUNTER++;
return ao4;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
void accept(String color) throws CountDownExc {
switch (color) {
case "e":
empty();
break;
case "own":
own();
break;
case "other":
other();
break;
default:
throw new RuntimeException("Illegal color!!!");
}
}
void empty() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[4][2] += fd0;
    fd1 = fd0 + fd1;
    fb1 = !fb0;
    double ld0 = 506.6682592348135;
    ld0 = fd0 + fd1;
    ld0 = fd0 - fd1;
    double ld1 = 829.4241100288608;
    Output.points[4][3] += ld0;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
    fb1 = ld1 > fd0;
if(fo1 != null){
      fb0 = fo1.m2(fd1, ld0, ld1, fd0, fb1, fb0, fb1, fb0);
}

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void own() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 *= -1;
    double ld0 = 89.51017447789675;
if(fo1 != null){
      fo0 = fo1.m4();
}
    ld0 = fd0 + fd1;
if(fo0 != null){
      fo0.m1(ld0, fd0, fd1, ld0);
}
if(fo1 != null){
      fd0 = fo1.m3(fb1, fb0, fb1, fb0);
}
    Thought lo1 = Thought98.getInstance(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1);
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}
    fd0 = fd1 - ld0;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void other() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fd0 < fd1;
    fd0 = fd1 + fd0;
    boolean lb0 = true;
    fd1 = fd0 - fd1;
    fb0 = fd0 > fd1;
    fb1 = fd0 > fd1;
    lb0 = fb0 || fb1;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
        double ld1 = 610.5446284019843;
if(fo1 != null){
      ld1 = fo1.m3(fd0, fd1, ld1, fd0, lb0, fb0, fb1, lb0);
}
    Thought lo2 = Thought75.getInstance();

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
}
