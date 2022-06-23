package genetic;
import java.util.ArrayList;
class Thought49 extends Thought{
private static ArrayList<Thought49> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = true;
private double fd0 = 408.9189174567078;
private double fd1 = 355.47124013702563;
private Thought fo0 = null;
private Thought fo1 = null;
Thought49 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought49 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought49 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought49 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought49 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought49 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought49 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought49 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought49 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought49 instance = new Thought49 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought49 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought49 instance = new Thought49 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought49 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought49 instance = new Thought49 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought49 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought49 instance = new Thought49 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought49 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought49 instance = new Thought49 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought49 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought49 instance = new Thought49 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought49 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought49 instance = new Thought49 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought49 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought49 instance = new Thought49 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    double ld0 = 720.4051484828216;
    boolean lb1 = false;
    boolean lb2 = true;
if(fo0 != null){
      fo1 = fo0.m4(ld0, fd0, fd1, ld0);
}
    boolean lb3 = false;
    fd0 *= -1;
if(fo1 != null){
      lb2 = fo1.m2(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1);
}
    ld0 = fd0 + fd1;
    boolean lb4 = true;
if(fo1 != null){
      fo0 = fo1.m4(lb3, lb4, fb0, fb1);
}
if(fo0 != null){
      ld0 = fo0.m3();
}
if(fo1 != null){
      fo1.m1(fd0, fd1, ld0, fd0, lb1, lb2, lb3, lb4);
}
    fd1 *= -1;
    ld0 = fd0 - fd1;
    fb0 = ld0 < fd0;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1, lb1, lb2, lb3, lb4);
}
    fb0 = fb1 && lb1;

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
    fd0 *= -1;
    boolean lb0 = true;
    double ld1 = 673.9461545862846;
    ab1 = ab2 || ab3;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ab4, fb0, fb1, lb0);
}
if(fo1 != null){
      ab1 = fo1.m2(fd0, fd1, ld1, fd0);
}
    Thought lo2 = Thought81.getInstance(fo0, fo1, fo0, fo1, fd1, ld1, fd0, fd1);
    ld1 *= -1;
if(fo0 != null){
      fo0.m1(ab2, ab3, ab4, fb0);
}
    if (fb1) {
if(fo0 != null){
          fo1 = fo0.m4();
}
        fd0 = fd1 + ld1;
        boolean lb3 = true;
        lb3 = lb0 && ab1;
        Thought lo4 = Thought19.getInstance(fd0, fd1, ld1, fd0, ab2, ab3, ab4, fb0);
        Output.points[2][6] += fd1;
        Thought lo5 = Thought14.getInstance(fo1, fo0, fo1, fo0);
        ld1 = fd0 + fd1;
if(fo1 != null){
          fb1 = fo1.m2(fo0, fo1, fo0, fo1, ld1, fd0, fd1, ld1, lb3, lb0, ab1, ab2);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
        fd0 = fd1 + ld1;
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, ld1, fd0);
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
void m1(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = !fb1;
    ad1 *= -1;
if(fo0 != null){
      ad2 = fo0.m3(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
    fb0 = !fb1;
    fb0 = ad1 > ad2;
        boolean lb0 = true;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, lb0, fb0);
}
    ad3 *= -1;
    fb1 = lb0 || fb0;
if(fo1 != null){
      fo1.m2();
}
    ad4 = fd0 - fd1;
    double ld1 = 682.5763184315972;
if(fo0 != null){
      ld1 = fo0.m3(ad1, ad2, ad3, ad4, fb1, lb0, fb0, fb1);
}
    fd0 *= -1;
    Thought lo2 = Thought39.getInstance(fo1, fo0, fo1, fo0);
    fd1 *= -1;
    lb0 = fb0 && fb1;
    lb0 = fb0 || fb1;
    ld1 *= -1;
if(fo1 != null){
      ad1 = fo1.m3(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, lb0, fb0, fb1, lb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb0, fb0);
}
    boolean lb3 = false;
    fb0 = fd1 < ld1;
        for(int i0=0; i0<10; i0++){
if(fo0 != null){
          fo0.m2(ad1, ad2, ad3, ad4);
}
        boolean lb4 = true;
        fb0 = fb1 && lb4;
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
    double ld0 = 954.4472423249464;
    ab2 = ab3 || ab4;
    fb0 = ad1 < ad2;
    Thought lo1 = Thought15.getInstance(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
    fb1 = ab1 || ab2;
    ab3 = ld0 < ad1;
    ad2 *= -1;
if(fo1 != null){
      ab4 = fo1.m2(fb0, fb1, ab1, ab2);
}
if(fo0 != null){
      ab3 = fo0.m2();
}
    ab4 = fb0 && fb1;
    Thought lo2 = Thought47.getInstance(ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, ld0, ad1, ad2, ad3, fb1, ab1, ab2, ab3);
}
if(fo1 != null){
      ab4 = fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, ab1, ab2);
}
    boolean lb3 = false;
    Output.points[2][7] += ad4;
if(fo0 != null){
      fo0.m3(fd0, fd1, ld0, ad1);
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
    Output.points[2][8] += fd0;
    fb0 = fd1 > fd0;
if(ao2 != null){
      fb1 = ao2.m2(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
    Thought lo0 = Thought61.getInstance(fb0, fb1, fb0, fb1);
    boolean lb1 = true;
    fd0 = fd1 - fd0;
    Output.points[3][0] -= fd1;
    lb1 = fd0 > fd1;
    Thought lo2 = Thought49.getInstance();
    fd0 = fd1 + fd0;
if(ao1 != null){
      fd1 = ao1.m3(fd0, fd1, fd0, fd1, fb0, fb1, lb1, fb0);
}
    for(int i0=0; i0<10; i0++){
        fd0 = fd1 + fd0;
        fd1 = fd0 + fd1;
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
    ad1 = ad2 - ad3;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    Output.points[3][1] += ad4;
    fb0 = fd0 < fd1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
    for(int i0=0; i0<10; i0++){
        fd1 = ad1 - ad2;
if(ao1 != null){
          ad3 = ao1.m3(ad4, fd0, fd1, ad1);
}
        fb1 = fb0 && fb1;
        fb0 = ad2 < ad3;
if(ao2 != null){
          ad4 = ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, ad1, ad2);
}
        fb1 = fb0 || fb1;
        boolean lb0 = true;
        Thought lo1 = Thought87.getInstance(lb0, fb0, fb1, lb0);
        fb0 = !fb1;
        lb0 = fb0 || fb1;
        Thought lo2 = Thought62.getInstance();
        Thought lo3 = Thought82.getInstance(ad3, ad4, fd0, fd1, lb0, fb0, fb1, lb0);
        double ld4 = 644.8616871402668;
        fb0 = !fb1;
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0);
}
    boolean lb0 = true;
    lb0 = !ab1;
if(fo1 != null){
      fo1.m3(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo0.m3(fo1, ao1, ao2, ao3, fb1, lb0, ab1, ab2);
}
    double ld1 = 629.9049348452246;
    ld1 *= -1;
    ab3 = ab4 || fb0;
    boolean lb2 = true;
    fb0 = fd0 < fd1;
    fb1 = lb0 && lb2;

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
    ad1 = ad2 - ad3;
    ab1 = ad4 < fd0;
if(ao3 != null){
      ao2 = ao3.m4(fd1, ad1, ad2, ad3);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad4, fd0, fd1, ad1);
}
if(ao4 != null){
      ad2 = ao4.m3(ab2, ab3, ab4, fb0);
}
    fb1 = ab1 || ab2;
if(fo0 != null){
      fo0.m3();
}
if(ao1 != null){
      fo1 = ao1.m4(ad3, ad4, fd0, fd1, ab3, ab4, fb0, fb1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    boolean lb0 = false;
    double ld1 = 121.7375240003709;

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
    boolean lb0 = false;
if(fo1 != null){
      lb0 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
    Thought lo1 = Thought60.getInstance(fo0, fo1, fo0, fo1, fb1, lb0, fb0, fb1);
if(fo0 != null){
      fo0.m3(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
    Thought lo2 = Thought35.getInstance(lb0, fb0, fb1, lb0);
    fb0 = fb1 || lb0;
if(fo0 != null){
      fo0.m3();
}
    fb0 = fd1 > fd0;
    fb1 = lb0 && fb0;
    fd1 *= -1;
    Output.points[3][2] -= fd0;
    Thought lo3 = Thought77.getInstance(fd1, fd0, fd1, fd0, fb1, lb0, fb0, fb1);

Thought.STACK_COUNTER++;
return lb0;
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
    boolean lb0 = false;
    fd1 *= -1;
    ab1 = fd0 < fd1;
    double ld1 = 172.03432473573127;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
    ab2 = ab3 && ab4;
    fb0 = ld1 < fd0;
        boolean lb2 = false;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd1, ld1, fd0, fd1, fb0, fb1, lb0, lb2);
}
    ab1 = ab2 && ab3;
    Thought lo3 = Thought34.getInstance(fo1, fo0, fo1, fo0, ab4, fb0, fb1, lb0);
    ld1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld1, fd0);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd1, ld1, fd0, fd1);
}
    lb2 = ld1 > fd0;
    ab1 = fd1 > ld1;
    Output.points[3][3] += fd0;
if(fo0 != null){
      fo0.m1(ab2, ab3, ab4, fb0);
}
    fd1 = ld1 - fd0;

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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
if(fo1 != null){
      ad1 = fo1.m3();
}
    lb0 = !fb0;
    boolean lb1 = true;
    double ld2 = 848.7947442993534;
    fb0 = fb1 || lb0;
    lb1 = ad1 < ad2;
    ad3 = ad4 + fd0;
    fb0 = fb1 && lb0;
    lb1 = fd1 < ld2;
    double ld3 = 484.36934254725;
    Output.points[3][4] += ld3;
    fb0 = fb1 || lb0;
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4, lb1, fb0, fb1, lb0);
}
    fd0 *= -1;
    boolean lb4 = false;
    boolean lb5 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, ld2, ld3, ad1, ad2, lb1, lb4, lb5, fb0);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fb1, lb0, lb1, lb4);
}
    boolean lb6 = true;
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1);
}
    ld2 = ld3 - ad1;
    lb5 = lb6 || fb0;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
    fb1 = !lb0;

Thought.STACK_COUNTER++;
return lb1;
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
    ab1 = ad2 < ad3;
    Thought lo0 = Thought16.getInstance(ab2, ab3, ab4, fb0);
if(fo1 != null){
      fo1.m3();
}
    fb1 = ab1 || ab2;
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ad1, ab3, ab4, fb0, fb1);
}
    Output.points[3][5] += ad2;
    ab1 = ab2 || ab3;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
    ab4 = fb0 && fb1;
    boolean lb1 = false;
    Output.points[3][6] -= ad3;
    lb1 = ad4 > fd0;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, lb1, ab1);
}
    ab2 = ab3 || ab4;
    fb0 = fb1 && lb1;
    ab1 = fd1 < ad1;
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0);
}
if(fo1 != null){
      ab2 = fo1.m2(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3);
}
    boolean lb2 = false;
    ad4 = fd0 - fd1;
    ad1 = ad2 - ad3;
    double ld3 = 421.1842216797818;
        Output.points[3][7] -= ad3;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fb1 || fb0;
if(ao1 != null){
      fd0 = ao1.m3(fb1, fb0, fb1, fb0);
}
if(ao3 != null){
      ao2 = ao3.m4();
}
if(fo0 != null){
      ao4 = fo0.m4(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fd1 *= -1;
    double ld0 = 143.47913782869563;
    fb1 = fb0 || fb1;
if(fo1 != null){
      ld0 = fo1.m3(ao1, ao2, ao3, ao4);
}
    fd0 = fd1 - ld0;
    fd0 = fd1 + ld0;
    Thought lo1 = Thought48.getInstance(fo0, fo1, ao1, ao2, fd0, fd1, ld0, fd0, fb0, fb1, fb0, fb1);
if(ao3 != null){
      fd1 = ao3.m3(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
    fb1 = fb0 && fb1;
    boolean lb2 = false;
    lb2 = !fb0;
    fb1 = ld0 > fd0;
if(ao2 != null){
      lb2 = ao2.m2(fd1, ld0, fd0, fd1);
}
    fb0 = fb1 && lb2;
if(ao3 != null){
      ld0 = ao3.m3(ao4, fo0, fo1, ao1, fd0, fd1, ld0, fd0);
}
if(ao3 != null){
      ao2 = ao3.m4(fb0, fb1, lb2, fb0);
}
    fd1 = ld0 + fd0;
    double ld3 = 446.22075381295144;
    Thought lo4 = Thought87.getInstance();

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fb1 || fb0;
    boolean lb0 = true;
    ad1 = ad2 + ad3;
        Output.points[3][8] -= ad4;
if(ao2 != null){
      fd0 = ao2.m3(fd1, ad1, ad2, ad3, fb0, fb1, lb0, fb0);
}
    ad4 *= -1;
    fb1 = fd0 < fd1;
    lb0 = ad1 < ad2;
if(ao3 != null){
      fb0 = ao3.m2(ao4, fo0, fo1, ao1);
}
    Thought lo1 = Thought62.getInstance(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1, fb1, lb0, fb0, fb1);
if(fo1 != null){
      lb0 = fo1.m2(ao1, ao2, ao3, ao4, fb0, fb1, lb0, fb0);
}
    fb1 = lb0 && fb0;

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
    ab1 = !ab2;
    ab3 = ab4 || fb0;
    boolean lb0 = true;
    fd0 = fd1 + fd0;
    fb0 = fb1 && lb0;
    ab1 = ab2 || ab3;
    ab4 = !fb0;
    Thought lo1 = Thought72.getInstance(fd1, fd0, fd1, fd0);
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
    Thought lo2 = Thought30.getInstance(fb1, lb0, ab1, ab2);
    boolean lb3 = true;
    Thought lo4 = Thought89.getInstance();
    fd1 = fd0 - fd1;
    fd0 = fd1 + fd0;
    Thought lo5 = Thought40.getInstance(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
    fb1 = !lb0;
    double ld6 = 154.51436361343687;
if(fo1 != null){
      lb3 = fo1.m2(ao1, ao2, ao3, ao4);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd0, fd1, ld6, fd0, ab1, ab2, ab3, ab4);
}
    Thought lo7 = Thought14.getInstance(fo0, fo1, ao1, ao2, fb0, fb1, lb0, lb3);
    ab1 = ab2 || ab3;
if(ao3 != null){
      ao3.m2(fd1, ld6, fd0, fd1);
}
if(ao4 != null){
      ld6 = ao4.m3(fo0, fo1, ao1, ao2, fd0, fd1, ld6, fd0);
}
    ab4 = fb0 || fb1;
if(ao4 != null){
      ao3 = ao4.m4(lb0, lb3, ab1, ab2);
}
    ab3 = fd1 < ld6;
if(fo0 != null){
      fo0.m3();
}
    ab4 = fb0 && fb1;

Thought.STACK_COUNTER++;
return lb0;
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
    boolean lb0 = true;
    ad2 = ad3 - ad4;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, ad1, ad2, ab1, ab2, ab3, ab4);
}
    fb0 = ad3 > ad4;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
if(ao4 != null){
      fb1 = ao4.m2(fo0, fo1, ao1, ao2, fd0, fd1, ad1, ad2, lb0, ab1, ab2, ab3);
}
    boolean lb1 = true;
    double ld2 = 343.94325532954963;
    boolean lb3 = true;
    Thought lo4 = Thought47.getInstance(ao3, ao4, fo0, fo1, ab2, ab3, ab4, fb0);

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
    Thought lo0 = Thought79.getInstance(fd0, fd1, fd0, fd1);
    double ld1 = 999.7772486774427;
    boolean lb2 = true;
    lb2 = !fb0;
    Thought lo3 = Thought79.getInstance(fo0, fo1, fo0, fo1, ld1, fd0, fd1, ld1);
    boolean lb4 = false;
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, lb2, lb4);
}
    Thought lo5 = Thought97.getInstance();
    fd1 = ld1 - fd0;
    fd1 = ld1 - fd0;
    Output.points[4][0] -= fd1;
if(fo1 != null){
      fo0 = fo1.m4(ld1, fd0, fd1, ld1, fb0, fb1, lb2, lb4);
}
                fd0 = fd1 + ld1;
    fb0 = fd0 > fd1;
    fb1 = ld1 > fd0;
    boolean lb6 = false;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
    double ld7 = 462.0154054638603;
    Output.points[4][1] -= fd0;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd1, ld1, ld7, fd0, lb2, lb4, lb6, fb0);
}
    Output.points[4][2] += fd1;
    double ld8 = 237.50474579884494;
    fb1 = ld1 < ld7;
    lb2 = lb4 && lb6;

Thought.STACK_COUNTER++;
return ld8;
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
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo1.m2(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
    fd0 = fd1 - fd0;
    fd1 = fd0 + fd1;
    double ld0 = 343.09430133019276;
    ld0 = fd0 - fd1;
    ld0 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0);
}
if(fo0 != null){
      fb1 = fo0.m2(ab1, ab2, ab3, ab4);
}
    fb0 = fb1 || ab1;
if(fo1 != null){
      fd0 = fo1.m3();
}
    ab2 = fd1 < ld0;
    ab3 = ab4 && fb0;

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
    Thought lo0 = Thought75.getInstance(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
    Thought lo1 = Thought7.getInstance(fo0, fo1, fo0, fo1);
    boolean lb2 = true;
    boolean lb3 = false;
    lb3 = fd0 > fd1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, fb0, fb1, lb2, lb3);
}
    fb0 = fd0 > fd1;
    ad1 = ad2 + ad3;
    fb1 = ad4 > fd0;
    lb2 = fd1 > ad1;
    lb3 = ad2 > ad3;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb2, lb3);
}
if(fo1 != null){
      fo1.m1(ad4, fd0, fd1, ad1);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
    fd1 = ad1 - ad2;
    boolean lb4 = true;
    Thought lo5 = Thought6.getInstance(lb4, fb0, fb1, lb2);

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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought45.getInstance();
    ab2 = ad2 > ad3;
    ab3 = !ab4;
    fb0 = fb1 && ab1;
    ab2 = ad4 < fd0;
    for(int i0=0; i0<10; i0++){
        for(int i1=0; i1<10; i1++){
            fd1 *= -1;
if(fo1 != null){
              fo0 = fo1.m4(ad1, ad2, ad3, ad4, ab3, ab4, fb0, fb1);
}
            fd0 = fd1 + ad1;
            boolean lb1 = false;
            lb1 = ab1 || ab2;
            Thought lo2 = Thought19.getInstance(fo0, fo1, fo0, fo1);
            for(int i2=0; i2<10; i2++){
                boolean lb3 = false;
                ad2 *= -1;
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    fb0 = fb1 || lb0;
    fb0 = fd1 < fd0;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0, fb1, lb0, fb0, fb1);
}
if(fo1 != null){
      fd1 = fo1.m3(ao1, ao2, ao3, ao4, lb0, fb0, fb1, lb0);
}
    fd0 = fd1 + fd0;
    fb0 = !fb1;
    lb0 = fb0 && fb1;
    boolean lb1 = false;
    lb0 = lb1 && fb0;
    fd1 *= -1;
    Thought lo2 = Thought33.getInstance(fd0, fd1, fd0, fd1);
    for(int i0=0; i0<10; i0++){
        Output.points[4][3] += fd0;
        double ld3 = 970.4712877144449;
        fb1 = lb0 && lb1;
if(fo0 != null){
          fb0 = fo0.m2(fo1, ao1, ao2, ao3, fd0, fd1, ld3, fd0);
}
        fb1 = lb0 && lb1;
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 690.1499063150446;
if(ao3 != null){
      ao2 = ao3.m4(fb0, fb1, fb0, fb1);
}
    double ld1 = 691.4733795911025;
    ld1 = ad1 + ad2;
    boolean lb2 = false;
if(ao4 != null){
      ad3 = ao4.m3();
}
    ad4 = fd0 - fd1;
if(fo0 != null){
      fo0.m3(ld0, ld1, ad1, ad2, lb2, fb0, fb1, lb2);
}
if(fo1 != null){
      fo1.m2(ao1, ao2, ao3, ao4);
}
    ad3 = ad4 - fd0;
if(fo0 != null){
      fo0.m2(fo1, ao1, ao2, ao3, fd1, ld0, ld1, ad1, fb0, fb1, lb2, fb0);
}
    ad2 = ad3 + ad4;
    double ld3 = 251.2557066490363;
    boolean lb4 = true;
    fb0 = !fb1;
    boolean lb5 = false;
    lb2 = lb4 || lb5;

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
if(ao2 != null){
      ab2 = ao2.m2(ao3, ao4, fo0, fo1, ab3, ab4, fb0, fb1);
}
if(ao1 != null){
      ab1 = ao1.m2(fd1, fd0, fd1, fd0);
}
    boolean lb0 = true;
    Thought lo1 = Thought86.getInstance(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
    boolean lb2 = false;
    lb2 = ab1 || ab2;
if(fo1 != null){
      fo1.m1(ab3, ab4, fb0, fb1);
}
    Output.points[4][4] += fd1;
    boolean lb3 = false;
    double ld4 = 574.3661826359224;
if(ao2 != null){
      ao1 = ao2.m4();
}
if(ao3 != null){
      lb0 = ao3.m2(ld4, fd0, fd1, ld4, lb2, lb3, ab1, ab2);
}
if(ao4 != null){
      ab3 = ao4.m2(fo0, fo1, ao1, ao2);
}
    fd0 *= -1;
    boolean lb5 = false;
    Output.points[4][5] += fd1;
    ab3 = ab4 && fb0;
    for(int i0=0; i0<10; i0++){
if(ao3 != null){
          ao3.m1(ao4, fo0, fo1, ao1, ld4, fd0, fd1, ld4, fb1, lb0, lb2, lb3);
}
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[4][6] -= ad1;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab2, ab3, ab4, fb0);
}
    for(int i0=0; i0<10; i0++){
        ad2 = ad3 + ad4;
        fb1 = !ab1;
        Thought lo0 = Thought72.getInstance(fd0, fd1, ad1, ad2);
        ab2 = ad3 < ad4;
        ab3 = ab4 || fb0;
        boolean lb1 = true;
        fb0 = fb1 && lb1;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ad1, ad2);
}
        ab1 = ad3 > ad4;
        fd0 *= -1;
if(ao2 != null){
          ab2 = ao2.m2(ab3, ab4, fb0, fb1);
}
if(ao3 != null){
          lb1 = ao3.m2();
}
        fd1 = ad1 - ad2;
        ad3 = ad4 - fd0;
if(fo0 != null){
          ao4 = fo0.m4(fd1, ad1, ad2, ad3, ab1, ab2, ab3, ab4);
}
        if (fb0) {
if(ao1 != null){
              fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
              ad4 = fo1.m3(ao1, ao2, ao3, ao4, fd0, fd1, ad1, ad2, fb1, lb1, ab1, ab2);
}
            ad3 = ad4 + fd0;
            ab3 = ab4 || fb0;
            Thought lo2 = Thought80.getInstance(fo0, fo1, ao1, ao2, fb1, lb1, ab1, ab2);
if(ao3 != null){
              fd1 = ao3.m3(ad1, ad2, ad3, ad4);
}
}}
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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    fd1 *= -1;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fb1 = lb0 || fb0;
if(fo1 != null){
      fo0 = fo1.m4(fb1, lb0, fb0, fb1);
}
if(fo0 != null){
      fo0.m2();
}
    lb0 = fb0 && fb1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
}
    fb0 = fb1 && lb0;
    double ld1 = 439.02143723416816;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1);
}

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
    double ld0 = 113.09904057389397;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0, ab1, ab2, ab3, ab4);
}
    fd0 *= -1;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, ab1, ab2);
}
    Output.points[4][7] += ld0;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld0, fd0);
}
    boolean lb1 = true;
    Thought lo2 = Thought6.getInstance(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1);
    Output.points[4][8] += ld0;
    fd0 = fd1 - ld0;
    ab2 = !ab3;
    ab4 = fb0 || fb1;
if(fo0 != null){
      fd0 = fo0.m3(lb1, ab1, ab2, ab3);
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
    fb0 = fb1 && fb0;
    Thought lo0 = Thought52.getInstance();
if(fo0 != null){
      fb1 = fo0.m2(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
    boolean lb1 = true;
    Thought lo2 = Thought41.getInstance(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3, lb1, fb0, fb1, lb1);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb1, fb0);
}
if(fo0 != null){
      ad4 = fo0.m3(fd0, fd1, ad1, ad2);
}
    ad3 = ad4 + fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
}
        ad4 *= -1;
    fd0 *= -1;
    Thought lo3 = Thought1.getInstance(fb1, lb1, fb0, fb1);
    lb1 = fb0 && fb1;
    boolean lb4 = false;
if(fo1 != null){
      fd1 = fo1.m3();
}
    Output.points[5][0] -= ad1;
    ad2 = ad3 + ad4;

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
Thought m4(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
if(fo1 != null){
      ad1 = fo1.m3(ad2, ad3, ad4, fd0, lb0, ab1, ab2, ab3);
}
if(fo0 != null){
          fo0.m1(fo1, fo0, fo1, fo0);
}
    boolean lb1 = true;
    ab3 = !ab4;
    boolean lb2 = true;
    ab4 = fd1 < ad1;
    fb0 = fb1 || lb0;
        for(int i0=0; i0<10; i0++){
        lb1 = lb2 && ab1;
        ad2 = ad3 - ad4;
if(fo1 != null){
          fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3, ab2, ab3, ab4, fb0);
}
        fb1 = lb0 || lb1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb2, ab1, ab2, ab3);
}
if(fo0 != null){
          ab4 = fo0.m2(ad4, fd0, fd1, ad1);
}
        Thought lo3 = Thought26.getInstance(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
if(fo1 != null){
          fb0 = fo1.m2(fb1, lb0, lb1, lb2);
}
if(fo1 != null){
          fo0 = fo1.m4();
}
        Output.points[5][1] -= fd1;
        for(int i1=0; i1<10; i1++){
            ad1 *= -1;
            ab1 = ad2 < ad3;
if(fo0 != null){
              fo0.m1(ad4, fd0, fd1, ad1, ab2, ab3, ab4, fb0);
}
            ad2 *= -1;
if(fo0 != null){
              fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
}}
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
    fb0 = fb1 || fb0;
    fd0 *= -1;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    fb1 = fd1 > fd0;
if(fo1 != null){
      fd1 = fo1.m3(ao1, ao2, ao3, ao4, fb0, fb1, fb0, fb1);
}
    fd0 = fd1 - fd0;
    fb0 = fb1 || fb0;
    fb1 = fb0 && fb1;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
    double ld0 = 370.0897358919887;
    Thought lo1 = Thought40.getInstance(ao1, ao2, ao3, ao4, ld0, fd0, fd1, ld0);

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = !fb1;
    double ld0 = 166.88222561553005;
if(ao3 != null){
      ao2 = ao3.m4(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      ao4 = fo0.m4();
}
if(fo1 != null){
      ad1 = fo1.m3(ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
    fd1 = ld0 - ad1;
    ad2 = ad3 + ad4;
if(ao1 != null){
      fb1 = ao1.m2(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
      fo1.m1(ao1, ao2, ao3, ao4, fd0, fd1, ld0, ad1, fb0, fb1, fb0, fb1);
}
    ad2 = ad3 - ad4;
    fd0 = fd1 - ld0;
    boolean lb1 = false;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, lb1, fb0, fb1, lb1);
}
    fb0 = !fb1;
    ad1 = ad2 + ad3;
    for(int i0=0; i0<10; i0++){
        lb1 = ad4 < fd0;
        fb0 = !fb1;
        lb1 = fd1 > ld0;
        ad1 *= -1;
        boolean lb2 = false;
        ad2 = ad3 + ad4;
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, ld0, ad1);
}
if(ao1 != null){
          ad2 = ao1.m3(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1);
}
        Output.points[5][2] -= ld0;
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 791.9308636905278;
    fd0 = fd1 - ld0;
if(ao1 != null){
      ab2 = ao1.m2(ab3, ab4, fb0, fb1);
}
if(ao3 != null){
      ao2 = ao3.m4();
}
if(fo0 != null){
      ao4 = fo0.m4(fd0, fd1, ld0, fd0, ab1, ab2, ab3, ab4);
}
    fb0 = fd1 > ld0;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    fb1 = fd0 > fd1;
if(fo1 != null){
      fo1.m3(ao1, ao2, ao3, ao4, ld0, fd0, fd1, ld0, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, ao1, ao2, ao3, fb0, fb1, ab1, ab2);
}
if(ao4 != null){
      ao4.m3(fd1, ld0, fd0, fd1);
}
    ab3 = ld0 < fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, ao1, ao2, ao3, ld0, fd0, fd1, ld0);
}
    fd0 *= -1;
    Output.points[5][3] += fd1;
if(fo0 != null){
      ao4 = fo0.m4(ab4, fb0, fb1, ab1);
}
    Output.points[5][4] += ld0;

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 = ad3 + ad4;
if(ao2 != null){
      ao1 = ao2.m4();
}
    fd0 = fd1 - ad1;
    ad2 *= -1;
    ad3 = ad4 - fd0;
    fd1 = ad1 + ad2;
    ab2 = ad3 > ad4;
    double ld0 = 675.2295433939018;
    ab3 = ad4 > fd0;
    ab4 = fd1 < ld0;
    if (fb0) {
        Thought lo1 = Thought0.getInstance(ad1, ad2, ad3, ad4, fb1, ab1, ab2, ab3);
        Thought lo2 = Thought12.getInstance(ao3, ao4, fo0, fo1);
        ab4 = fd0 > fd1;
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
    boolean lb0 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb0, fb0);
}
if(fo1 != null){
      fo1.m2(fd0, fd1, fd0, fd1);
}
    Output.points[5][5] += fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fb1 = fd1 < fd0;
    fd1 *= -1;
if(fo0 != null){
      fd0 = fo0.m3(lb0, fb0, fb1, lb0);
}
    fd1 *= -1;
    boolean lb1 = false;
    Thought lo2 = Thought24.getInstance();
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0, lb1, fb0, fb1, lb0);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, lb1, fb0, fb1, lb0);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, lb1, fb0, fb1, lb0);
}
    fd0 *= -1;
    lb1 = fb0 || fb1;
    fd1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    Output.points[5][6] += fd0;

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
    boolean lb0 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    Thought lo1 = Thought57.getInstance(lb0, fb0, fb1, lb0);
if(fo1 != null){
      fo1.m1();
}
if(fo0 != null){
      fo0.m1(fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
    boolean lb2 = true;
    fd1 = fd0 - fd1;
    fd0 = fd1 - fd0;
    fd1 = fd0 + fd1;
    fd0 *= -1;
    fd1 = fd0 - fd1;
    fd0 = fd1 - fd0;
    fb0 = fb1 && lb0;
    Thought lo3 = Thought74.getInstance(fo1, fo0, fo1, fo0);
    lb2 = fd1 > fd0;
    Output.points[5][7] -= fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, lb0, lb2);
}
    fb0 = fd0 < fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, lb0, lb2, fb0);
}
    Output.points[5][8] -= fd0;
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1);
}
    Thought lo4 = Thought8.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
    fd0 = fd1 - fd0;
    Thought lo5 = Thought3.getInstance(fb1, lb0, lb2, fb0);
if(fo0 != null){
      fd1 = fo0.m3();
}
if(fo1 != null){
      fb1 = fo1.m2(fd0, fd1, fd0, fd1, lb0, lb2, fb0, fb1);
}
if(fo0 != null){
      lb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      lb2 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, lb0, lb2);
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
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    Thought lo0 = Thought75.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
if(fo1 != null){
      fo1.m1(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fb0 = fo0.m2();
}
    boolean lb1 = false;
    fd0 = fd1 - fd0;
    double ld2 = 663.1574293034656;
    Thought lo3 = Thought12.getInstance(fd0, fd1, ld2, fd0, fb0, fb1, lb1, fb0);
    Output.points[6][0] += fd1;
    Output.points[6][1] += ld2;
    fb1 = lb1 || fb0;
    Thought lo4 = Thought98.getInstance(fo1, fo0, fo1, fo0);
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, ld2, fd0, fd1, fb1, lb1, fb0, fb1);
}
    Thought lo5 = Thought81.getInstance(fo0, fo1, fo0, fo1, lb1, fb0, fb1, lb1);
    fb0 = !fb1;
    ld2 = fd0 - fd1;
    lb1 = !fb0;
    boolean lb6 = true;
    Output.points[6][2] += ld2;
if(fo0 != null){
      fo0.m2(fd0, fd1, ld2, fd0);
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
}
