package genetic;
import java.util.ArrayList;
class Thought73 extends Thought{
private static ArrayList<Thought73> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = true;
private double fd0 = 934.4975343844959;
private double fd1 = 374.4040847109381;
private Thought fo0 = null;
private Thought fo1 = null;
Thought73 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought73 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought73 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought73 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought73 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought73 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought73 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought73 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought73 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought73 instance = new Thought73 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought73 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought73 instance = new Thought73 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought73 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought73 instance = new Thought73 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought73 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought73 instance = new Thought73 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought73 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought73 instance = new Thought73 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought73 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought73 instance = new Thought73 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought73 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought73 instance = new Thought73 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought73 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought73 instance = new Thought73 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    fb0 = fd1 > fd0;
if(fo1 != null){
      fb1 = fo1.m2(fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought244.getInstance(fo0, fo1, fo0, fo1);
    fb0 = fd1 > fd0;
    double ld1 = 411.11428840045016;
    Thought lo2 = Thought384.getInstance(fd0, fd1, ld1, fd0);
    Thought lo3 = Thought201.getInstance(fo0, fo1, fo0, fo1, fd1, ld1, fd0, fd1);
    ld1 = fd0 + fd1;
if(fo0 != null){
      fo0.m2(ld1, fd0, fd1, ld1, fb1, fb0, fb1, fb0);
}
    fd0 *= -1;
    fb1 = fb0 || fb1;
    Thought lo4 = Thought177.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
    Thought lo5 = Thought37.getInstance();
    fb0 = fb1 && fb0;
    Output.points[3][3] += fd1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ld1, fd0, fd1, ld1, fb1, fb0, fb1, fb0);
}
    Output.points[3][4] -= fd0;
    Output.points[3][5] += fd1;
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
    ld1 = fd0 - fd1;

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
    Output.points[3][6] -= fd1;
if(fo0 != null){
      ab2 = fo0.m2(fo1, fo0, fo1, fo0);
}
        fd0 = fd1 + fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
    double ld0 = 280.44927895257376;
    fd0 *= -1;
if(fo1 != null){
          ab3 = fo1.m2(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4(ld0, fd0, fd1, ld0, ab4, fb0, fb1, ab1);
}
    boolean lb1 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    fb0 = !fb1;
    lb1 = ab1 || ab2;

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
    ad2 = ad3 + ad4;
    double ld0 = 470.9368383785403;
    boolean lb1 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld0, fb0, fb1, lb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fb1, lb1, fb0, fb1);
}
    ad1 = ad2 - ad3;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ld0);
}
if(fo0 != null){
      ad1 = fo0.m3(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
    fd1 = ld0 + ad1;
    ad2 = ad3 + ad4;
    Output.points[3][7] += fd0;
if(fo1 != null){
      lb1 = fo1.m2(fd1, ld0, ad1, ad2, fb0, fb1, lb1, fb0);
}
    ad3 = ad4 - fd0;
    double ld2 = 212.48834314472543;
    double ld3 = 299.0767343784736;
    Output.points[3][8] -= ad4;
    fd0 = fd1 + ld0;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fb1, lb1, fb0, fb1);
}
if(fo1 != null){
      ld2 = fo1.m3();
}
    lb1 = !fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld3, ad1, ad2, ad3, fb1, lb1, fb0, fb1);
}
    ad4 = fd0 + fd1;
if(fo0 != null){
      lb1 = fo0.m2(fb0, fb1, lb1, fb0);
}
    fb1 = ld0 < ld2;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
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
    boolean lb0 = false;
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4);
}
    lb0 = ab1 || ab2;
    ab3 = !ab4;
    for(int i0=0; i0<10; i0++){
        fd0 = fd1 - ad1;
if(fo1 != null){
          ad2 = fo1.m3(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
        fb0 = fb1 || lb0;
if(fo0 != null){
          ab1 = fo0.m2(ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
        fb1 = fd0 > fd1;
        lb0 = !ab1;
        Output.points[4][0] += ad1;
        double ld1 = 648.6076870590163;
        ab2 = !ab3;
        ab4 = ad1 < ad2;
        ad3 = ad4 - fd0;
if(fo1 != null){
          fd1 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, lb0, ab1);
}
        ld1 = ad1 - ad2;
        if (ab2) {
            Output.points[4][1] += ad3;
            boolean lb2 = true;
            Thought lo3 = Thought139.getInstance();
            ab2 = ad4 < fd0;
if(fo1 != null){
              fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld1, ad1, ad2, ab3, ab4, fb0, fb1);
}
            lb2 = !lb0;
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fb1 || fb0;
    boolean lb0 = false;
    fb0 = !fb1;
    Output.points[4][2] += fd1;
    lb0 = fb0 && fb1;
    lb0 = fb0 && fb1;
    boolean lb1 = true;
if(ao2 != null){
      ao1 = ao2.m4(lb0, lb1, fb0, fb1);
}
    boolean lb2 = true;
    lb0 = !lb1;
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1);
}
    lb2 = fd0 > fd1;
    fb0 = fd0 < fd1;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1);
}
    fb1 = lb0 || lb1;
    double ld3 = 746.6456232122222;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ld3, fd0, fd1, ld3);
}
    fd0 = fd1 - ld3;
    fd0 = fd1 - ld3;
if(ao4 != null){
      ao4.m1(fd0, fd1, ld3, fd0, lb2, fb0, fb1, lb0);
}
    fd1 = ld3 - fd0;
    fd1 *= -1;
    Output.points[4][3] -= ld3;
    Output.points[4][4] += fd0;
    double ld4 = 950.8456106602396;

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
    ad1 *= -1;
if(ao1 != null){
      ad2 = ao1.m3(ao2, ao3, ao4, fo0, fb1, fb0, fb1, fb0);
}
    ad3 *= -1;
    ad4 = fd0 - fd1;
if(fo1 != null){
      fo1.m1();
}
    fb1 = ad1 > ad2;
    ad3 *= -1;
    double ld0 = 515.685999228386;
    ad3 *= -1;
    fb0 = ad4 < fd0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, ld0, ad1, ad2, fb1, fb0, fb1, fb0);
}
if(ao1 != null){
      ao1.m3(fb1, fb0, fb1, fb0);
}
    double ld1 = 74.17264494927548;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1);
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
    fd1 = fd0 + fd1;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, fd0, fd1);
}
    Thought lo0 = Thought391.getInstance(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
    ab2 = fd0 < fd1;
    ab3 = ab4 || fb0;
    fd0 = fd1 + fd0;
    boolean lb1 = true;
    fb0 = fb1 && lb1;
    double ld2 = 459.6613835425798;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, ld2, fd0, ab1, ab2, ab3, ab4);
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
if(ao1 != null){
      ad4 = ao1.m3(ao2, ao3, ao4, fo0, ab2, ab3, ab4, fb0);
}
    fb1 = ab1 || ab2;
    ab3 = fd0 < fd1;
    ad1 = ad2 - ad3;
    boolean lb0 = false;
    boolean lb1 = true;
if(ao1 != null){
          fo1 = ao1.m4();
}
    Thought lo2 = Thought279.getInstance(ao2, ao3, ao4, fo0, ad4, fd0, fd1, ad1, ab2, ab3, ab4, fb0);
    double ld3 = 165.0391149019447;
    Thought lo4 = Thought4.getInstance(fb1, lb0, lb1, ab1);
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    ad1 = ad2 + ad3;
    boolean lb5 = true;
    ad4 *= -1;
    if (ab1) {
if(fo1 != null){
          fd0 = fo1.m3(fd1, ld3, ad1, ad2);
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
boolean m2() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fb1 || fb0;
    fb1 = !fb0;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    if (fb1) {
        fd1 = fd0 + fd1;
if(fo1 != null){
          fo1.m2(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
        fd0 = fd1 - fd0;
        fb0 = fb1 || fb0;
        fb1 = fd1 < fd0;
        boolean lb0 = true;
        lb0 = fd1 > fd0;
        boolean lb1 = false;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb1, fb0, fb1, lb0);
}
        lb1 = fb0 || fb1;
        Output.points[4][5] -= fd1;
if(fo0 != null){
          lb0 = fo0.m2();
}
        fd0 = fd1 - fd0;
if(fo1 != null){
          fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, lb1, fb0, fb1, lb0);
}
if(fo1 != null){
          fo0 = fo1.m4(lb1, fb0, fb1, lb0);
}
        fd1 = fd0 + fd1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
          lb1 = fo0.m2(fd0, fd1, fd0, fd1);
}
        Output.points[4][6] += fd0;
        fd1 = fd0 + fd1;
if(fo1 != null){
          fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
        fb0 = fd1 < fd0;
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
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo0.m3(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    Thought lo0 = Thought342.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, ab1, ab2);
    boolean lb1 = true;
    Thought lo2 = Thought373.getInstance();
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    fb1 = !lb1;
    boolean lb3 = true;
    fd0 = fd1 - fd0;
    fd1 = fd0 - fd1;
if(fo0 != null){
      fd0 = fo0.m3(lb3, ab1, ab2, ab3);
}
    ab4 = fd1 < fd0;
    fb0 = !fb1;
    lb1 = !lb3;
    fd1 = fd0 - fd1;
if(fo1 != null){
      ab1 = fo1.m2(fo0, fo1, fo0, fo1);
}

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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo0.m1(ad1, ad2, ad3, ad4);
}
    fd0 *= -1;
    fb0 = fd1 > ad1;
    ad2 = ad3 - ad4;
    Thought lo0 = Thought61.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2);
if(fo0 != null){
      fo1 = fo0.m4(ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
    Thought lo1 = Thought306.getInstance();
    for(int i0=0; i0<10; i0++){
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
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 364.71992016267734;
    ab2 = !ab3;
    ab4 = ld0 < ad1;
    ad2 = ad3 + ad4;
    fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld0, ad1, ad2, fb0, fb1, ab1, ab2);
}
if(fo1 != null){
      ab3 = fo1.m2(ab4, fb0, fb1, ab1);
}
if(fo0 != null){
      ad3 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      ab2 = fo1.m2(ad4, fd0, fd1, ld0);
}
    ad1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
    boolean lb1 = true;
    fd1 = ld0 + ad1;
    ab2 = ab3 && ab4;
    fb0 = !fb1;
    lb1 = !ab1;
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
    double ld2 = 173.16444961488784;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fb1, lb1, ab1, ab2);
}
    ab3 = !ab4;
    fb0 = !fb1;
if(fo1 != null){
      fo1.m1();
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld0, ld2, ad1, lb1, ab1, ab2, ab3);
}

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
    boolean lb0 = true;
    fb0 = !fb1;
    Output.points[4][7] += fd1;
if(ao2 != null){
      ao1 = ao2.m4(lb0, fb0, fb1, lb0);
}
    fb0 = fd0 > fd1;
    double ld1 = 509.0362792558156;
    boolean lb2 = false;
    double ld3 = 694.3151452592789;
    ld1 *= -1;
    fb0 = fb1 && lb0;
    lb2 = ld3 > fd0;

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
    fb1 = ad2 > ad3;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0);
}
    boolean lb0 = true;
    Thought lo1 = Thought155.getInstance(ad4, fd0, fd1, ad1);
    Thought lo2 = Thought231.getInstance(fo1, ao1, ao2, ao3, ad2, ad3, ad4, fd0);
    lb0 = fb0 && fb1;
    double ld3 = 44.75613683216052;
    Thought lo4 = Thought104.getInstance(fd0, fd1, ld3, ad1, lb0, fb0, fb1, lb0);
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb0, fb1, lb0, fb0);
}
    fb1 = ad2 > ad3;
    ad4 = fd0 + fd1;
    if (lb0) {
        Thought lo5 = Thought263.getInstance();
        double ld6 = 887.486588324741;
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
if(ao2 != null){
      ao1 = ao2.m4(fb0, fb1, ab1, ab2);
}
    ab3 = ab4 || fb0;
    boolean lb0 = true;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
if(ao4 != null){
      ao3 = ao4.m4(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1);
}
if(ao4 != null){
      ao4.m2(fd0, fd1, fd0, fd1, fb0, fb1, lb0, ab1);
}
    boolean lb1 = true;
if(fo0 != null){
      ab1 = fo0.m2(fo1, ao1, ao2, ao3, ab2, ab3, ab4, fb0);
}
if(ao4 != null){
      fd0 = ao4.m3();
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0, fb1, lb0, lb1, ab1);
}
    fd1 *= -1;
    fd0 *= -1;
        fd1 = fd0 + fd1;
    Thought lo2 = Thought318.getInstance(ab2, ab3, ab4, fb0);
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = !ab2;
    ab3 = ad1 > ad2;
    ad3 = ad4 + fd0;
    double ld0 = 519.5799185487723;
    double ld1 = 404.21219447354673;
    boolean lb2 = true;
if(ao2 != null){
      ao1 = ao2.m4(ad4, fd0, fd1, ld0);
}
    ab3 = ab4 || fb0;
if(ao3 != null){
      fb1 = ao3.m2(ao4, fo0, fo1, ao1, ld1, ad1, ad2, ad3);
}
    boolean lb3 = false;
    Output.points[4][8] += ad4;
if(ao2 != null){
      ao2.m1(fd0, fd1, ld0, ld1, lb2, lb3, ab1, ab2);
}
    ab3 = ad1 < ad2;
    ab4 = !fb0;
    fb1 = lb2 || lb3;
    ad3 = ad4 + fd0;
if(ao3 != null){
      fd1 = ao3.m3(ao4, fo0, fo1, ao1, ab1, ab2, ab3, ab4);
}
if(ao3 != null){
      ao2 = ao3.m4();
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ld0, ld1, ad1, ad2, fb0, fb1, lb2, lb3);
}
    Output.points[5][0] += ad3;

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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fb1 = fo1.m2(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0);
}
    fb0 = fb1 && fb0;
    fb1 = fd0 < fd1;
    Thought lo0 = Thought20.getInstance(fd0, fd1, fd0, fd1);
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fb0 = fb1 || fb0;
    if (fb1) {
if(fo1 != null){
          fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
        fb0 = fd1 < fd0;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
        boolean lb1 = false;
        fb0 = fb1 && lb1;
        fb0 = !fb1;
        boolean lb2 = true;
        lb1 = lb2 || fb0;
if(fo0 != null){
          fb1 = fo0.m2();
}
        } else {
        fd1 = fd0 + fd1;
        fb0 = fd0 < fd1;
        fb1 = fb0 && fb1;
        boolean lb3 = false;
        fd0 *= -1;
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, lb3, fb0, fb1, lb3);
}
}
Thought.STACK_COUNTER++;
return fd1;
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
    fd0 = fd1 + fd0;
if(fo0 != null){
      ab2 = fo0.m2(ab3, ab4, fb0, fb1);
}
    fd1 = fd0 - fd1;
    Thought lo0 = Thought34.getInstance(fo1, fo0, fo1, fo0);
    boolean lb1 = false;
    fd0 = fd1 + fd0;
    lb1 = ab1 && ab2;
    fd1 = fd0 - fd1;
    fd0 = fd1 + fd0;
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    ab3 = fd0 < fd1;
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0, ab4, fb0, fb1, lb1);
}
    fd1 = fd0 - fd1;

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
    Thought lo0 = Thought159.getInstance(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
        double ld1 = 702.4087206057072;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      ad1 = fo0.m3(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
    boolean lb2 = false;
if(fo0 != null){
          fo1 = fo0.m4(fb0, fb1, lb2, fb0);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fb1 = fo0.m2(ld1, ad1, ad2, ad3);
}
    lb2 = fb0 || fb1;
    lb2 = ad4 < fd0;
    boolean lb3 = true;
    fd1 *= -1;
if(fo1 != null){
      lb3 = fo1.m2(fo0, fo1, fo0, fo1, ld1, ad1, ad2, ad3);
}

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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 *= -1;
    ab1 = ad3 < ad4;
    Thought lo0 = Thought163.getInstance(fd0, fd1, ad1, ad2, ab2, ab3, ab4, fb0);
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
    double ld1 = 812.5979664176729;
    boolean lb2 = false;
    ad2 = ad3 + ad4;
    boolean lb3 = false;
    double ld4 = 950.9594720570796;
    Output.points[5][1] -= ad4;
if(fo1 != null){
      fd0 = fo1.m3();
}
if(fo0 != null){
      ab3 = fo0.m2(fo1, fo0, fo1, fo0, fd1, ld1, ld4, ad1, ab4, fb0, fb1, lb2);
}
if(fo1 != null){
      lb3 = fo1.m2(ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      ad2 = fo0.m3(fo1, fo0, fo1, fo0);
}
    ad3 = ad4 - fd0;
    fb0 = fd1 < ld1;
    boolean lb5 = true;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    fd0 = fd1 + fd0;
    for(int i0=0; i0<10; i0++){
if(ao2 != null){
          fd1 = ao2.m3(fd0, fd1, fd0, fd1);
}
        boolean lb1 = false;
if(ao3 != null){
          fd0 = ao3.m3(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
        Output.points[5][2] -= fd1;
        fd0 = fd1 + fd0;
        fd1 = fd0 - fd1;
        lb0 = fd0 < fd1;
        fb0 = fb1 || lb1;
if(ao3 != null){
          ao2 = ao3.m4(fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb1);
}
        Thought lo2 = Thought167.getInstance(ao4, fo0, fo1, ao1, lb0, fb0, fb1, lb1);
        Thought lo3 = Thought368.getInstance();
if(ao2 != null){
          ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb1);
}
        Thought lo4 = Thought72.getInstance(lb0, fb0, fb1, lb1);
        fd0 = fd1 + fd0;
        Output.points[5][3] += fd1;
if(ao1 != null){
          ao1.m2(ao2, ao3, ao4, fo0);
}
        Thought lo5 = Thought239.getInstance(fd0, fd1, fd0, fd1);
        double ld6 = 456.2109068982369;
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0, ld6, fd0, fd1, ld6);
}
        lb0 = fd0 < fd1;
        ld6 *= -1;
        Output.points[5][4] -= fd0;
        double ld7 = 490.9868376961395;
        fd0 = fd1 + ld6;
if(ao1 != null){
          fo1 = ao1.m4(ld7, fd0, fd1, ld6, fb0, fb1, lb1, lb0);
}
        double ld8 = 728.1904524363898;
}
Thought.STACK_COUNTER++;
return fd1;
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
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
    ad1 = ad2 + ad3;
    ad4 = fd0 + fd1;
    fb1 = fb0 && fb1;
    Output.points[5][5] += ad1;
    fb0 = !fb1;
    fb0 = fb1 || fb0;
if(ao1 != null){
      ao1.m2();
}
    boolean lb0 = true;
    boolean lb1 = true;
    lb1 = !fb0;
    fb1 = ad2 < ad3;

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
    boolean lb0 = true;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, lb0, ab1, ab2, ab3);
}
if(ao3 != null){
      ao2 = ao3.m4(ab4, fb0, fb1, lb0);
}
    fd0 *= -1;
if(ao4 != null){
      ab1 = ao4.m2(fo0, fo1, ao1, ao2);
}
if(ao3 != null){
      ab2 = ao3.m2(fd1, fd0, fd1, fd0);
}
    ab3 = ab4 || fb0;
    fd1 = fd0 - fd1;
    fb1 = !lb0;
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1);
}
if(ao3 != null){
      ab1 = ao3.m2(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    fd0 *= -1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb1, lb0, ab1, ab2);
}
if(fo0 != null){
      ao4 = fo0.m4();
}
    boolean lb1 = false;
if(fo1 != null){
      fo1.m1(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    boolean lb2 = true;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, lb0, lb1);
}
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0);
}
if(ao1 != null){
          fo1 = ao1.m4(fd0, fd1, fd0, fd1);
}
    lb2 = fd0 > fd1;
    ab1 = ab2 || ab3;

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
    ad2 = ad3 + ad4;
    ab1 = !ab2;
    fd0 *= -1;
    for(int i0=0; i0<10; i0++){
        fd1 = ad1 + ad2;
        ad3 = ad4 - fd0;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, ad1, ad2, ad3);
}
if(ao3 != null){
          ao2 = ao3.m4(ad4, fd0, fd1, ad1, ab3, ab4, fb0, fb1);
}
        ad2 = ad3 - ad4;
        Output.points[5][6] -= fd0;
if(ao4 != null){
          ab1 = ao4.m2(fo0, fo1, ao1, ao2, ab2, ab3, ab4, fb0);
}
        fd1 = ad1 - ad2;
}
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
if(fo0 != null){
      fd1 = fo0.m3();
}
    boolean lb0 = true;
    boolean lb1 = true;
    lb1 = fb0 && fb1;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, lb0, lb1, fb0, fb1);
}
    fd0 = fd1 + fd0;
if(fo0 != null){
      lb0 = fo0.m2(lb1, fb0, fb1, lb0);
}
    lb1 = !fb0;
    fb1 = fd1 > fd0;
    lb0 = fd1 < fd0;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
    boolean lb2 = true;
if(fo0 != null){
      fo0.m1(fd1, fd0, fd1, fd0);
}
    Thought lo3 = Thought66.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);

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
Thought m4(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    for(int i0=0; i0<10; i0++){
        ab1 = ab2 || ab3;
if(fo0 != null){
          ab4 = fo0.m2(fd1, fd0, fd1, fd0, fb0, fb1, lb0, ab1);
}
        ab2 = fd1 < fd0;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
        lb0 = ab1 || ab2;
        boolean lb1 = false;
        Output.points[5][7] -= fd1;
if(fo0 != null){
          fo1 = fo0.m4();
}
        ab2 = fd0 < fd1;
        double ld2 = 900.8394393905786;
        Output.points[5][8] += ld2;
        Output.points[6][0] += fd0;
if(fo1 != null){
          fd1 = fo1.m3(fo0, fo1, fo0, fo1, ld2, fd0, fd1, ld2, ab3, ab4, fb0, fb1);
}
        Thought lo3 = Thought235.getInstance(lb1, lb0, ab1, ab2);
        boolean lb4 = true;
        fd0 = fd1 - ld2;
        ab2 = fd0 > fd1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
        ld2 = fd0 - fd1;
if(fo1 != null){
          fo0 = fo1.m4(ld2, fd0, fd1, ld2);
}
if(fo0 != null){
          fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ld2, fd0);
}
        Output.points[6][1] -= fd1;
        ab3 = ld2 > fd0;
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
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
    double ld0 = 462.4565444371713;
if(fo0 != null){
      ad4 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    fb0 = fd0 < fd1;
if(fo1 != null){
      fo1.m1();
}
if(fo0 != null){
      ld0 = fo0.m3(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
    fd0 *= -1;
    Thought lo1 = Thought257.getInstance(fb1, fb0, fb1, fb0);
    fb1 = fd1 > ld0;
    fb0 = !fb1;
    double ld2 = 266.66016251325635;
    Thought lo3 = Thought69.getInstance(fo1, fo0, fo1, fo0);

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
    ab1 = ab2 && ab3;
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
    ab4 = fb0 || fb1;
if(fo1 != null){
      fd0 = fo1.m3(fd1, ad1, ad2, ad3, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      ad4 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, ab1, ab2);
}
    ab3 = fd0 > fd1;
    ab4 = ad1 > ad2;
    fb0 = ad3 < ad4;
    fb1 = fd0 < fd1;
if(fo1 != null){
      fo1.m2();
}
    ab1 = ab2 || ab3;
    boolean lb0 = false;
    ad1 = ad2 - ad3;
    boolean lb1 = false;
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
          fo0 = fo1.m4(fb1, lb0, lb1, ab1);
}
        ab2 = ad2 < ad3;
        ab3 = ab4 || fb0;
        double ld2 = 890.8802687292446;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
        Thought lo3 = Thought115.getInstance(ad3, ad4, fd0, fd1);
        ld2 *= -1;
        Thought lo4 = Thought267.getInstance(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
        fb1 = !lb0;
if(fo0 != null){
          fo0.m1(fd0, fd1, ld2, ad1, lb1, ab1, ab2, ab3);
}
        ab4 = !fb0;
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[6][2] += fd0;
    fb1 = fd1 > fd0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fd1 = fd0 - fd1;
    fb0 = fb1 || fb0;
if(ao2 != null){
      ao1 = ao2.m4();
}
    fd0 = fd1 - fd0;
if(ao3 != null){
      fd1 = ao3.m3(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought90.getInstance(fb1, fb0, fb1, fb0);
        fb1 = fb0 || fb1;
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1);
}
    boolean lb1 = true;
    fd1 = fd0 + fd1;
if(ao1 != null){
      fd0 = ao1.m3(fd1, fd0, fd1, fd0);
}
    lb1 = fd1 > fd0;
    boolean lb2 = false;
    boolean lb3 = false;
    lb2 = fd1 > fd0;
    lb3 = fd1 < fd0;
    fd1 = fd0 - fd1;
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0, fb0, fb1, lb1, lb2);
}
    fd1 *= -1;

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = ad1 > ad2;
    boolean lb0 = false;
    ad3 = ad4 - fd0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, lb0, fb0);
}
if(ao2 != null){
      ao2.m2();
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, ad1, ad2, ad3, fb1, lb0, fb0, fb1);
}
    ad4 = fd0 + fd1;
if(ao3 != null){
      ad1 = ao3.m3(lb0, fb0, fb1, lb0);
}
    ad2 = ad3 + ad4;
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2);
}
    fd0 *= -1;
    Thought lo1 = Thought168.getInstance(fd1, ad1, ad2, ad3);
    for(int i0=0; i0<10; i0++){
        fb0 = ad4 < fd0;
}
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
    for(int i0=0; i0<10; i0++){
        Output.points[6][3] -= fd1;
        ab1 = ab2 || ab3;
        fd0 *= -1;
        for(int i1=0; i1<10; i1++){
            Thought lo0 = Thought232.getInstance(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
            Thought lo1 = Thought13.getInstance(fd1, fd0, fd1, fd0, ab4, fb0, fb1, ab1);
            fd1 *= -1;
if(ao1 != null){
              fo1 = ao1.m4(ao2, ao3, ao4, fo0, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
              fd0 = fo1.m3();
}
            fb1 = !ab1;
if(ao1 != null){
              fd1 = ao1.m3(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
            fb1 = fd0 < fd1;
if(ao1 != null){
              fo1 = ao1.m4(ab1, ab2, ab3, ab4);
}
}}
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0);
}
if(ao1 != null){
      fo1 = ao1.m4(ad1, ad2, ad3, ad4);
}
    boolean lb0 = true;
    Thought lo1 = Thought145.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, ad1, ad2);
if(ao1 != null){
      fo1 = ao1.m4(ad3, ad4, fd0, fd1, lb0, ab1, ab2, ab3);
}
    ad1 = ad2 + ad3;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, ab4, fb0, fb1, lb0);
}
    boolean lb2 = false;
if(ao1 != null){
      ad4 = ao1.m3();
}
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, fd0, fd1, ad1, ad2, lb2, ab1, ab2, ab3);
}
    ab4 = ad3 < ad4;
    boolean lb3 = false;
    boolean lb4 = false;
    Output.points[6][4] -= fd0;
    Output.points[6][5] += fd1;
    boolean lb5 = false;
    ad1 = ad2 + ad3;
    for(int i0=0; i0<10; i0++){
        boolean lb6 = false;
        Thought lo7 = Thought397.getInstance(ab1, ab2, ab3, ab4);
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
        ad4 = fd0 - fd1;
        ad1 *= -1;
        Thought lo8 = Thought217.getInstance(ad2, ad3, ad4, fd0);
        fd1 = ad1 + ad2;
        boolean lb9 = false;
if(ao1 != null){
          ab4 = ao1.m2(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1);
}
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
    Thought lo0 = Thought134.getInstance(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
    fd0 = fd1 + fd0;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    fd1 *= -1;
        fb1 = !fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = fd0 > fd1;
    boolean lb1 = false;
    lb1 = fd0 < fd1;
    fb0 = !fb1;
if(fo0 != null){
      fo1 = fo0.m4(lb1, fb0, fb1, lb1);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
    fb0 = fd1 > fd0;

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
    fb0 = fb1 || fb0;
    fd1 *= -1;
    Output.points[6][6] += fd0;
    boolean lb0 = false;
    double ld1 = 631.7440794723144;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld1, fd0);
}
    fd1 = ld1 - fd0;
        boolean lb2 = true;
    boolean lb3 = true;
    boolean lb4 = false;
    Thought lo5 = Thought221.getInstance(fo0, fo1, fo0, fo1, fd1, ld1, fd0, fd1);
if(fo0 != null){
      fo0.m2(ld1, fd0, fd1, ld1, lb2, lb3, lb4, fb0);
}
    fb1 = fd0 > fd1;
    Output.points[6][7] -= ld1;
    fd0 *= -1;
    lb0 = lb2 || lb3;

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
    double ld0 = 450.99684933914097;
    Output.points[6][8] += ld0;
    fb1 = !fb0;
    fb1 = !fb0;
    fb1 = fb0 || fb1;
    Output.points[7][0] -= fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    boolean lb1 = false;
    fd1 = ld0 + fd0;
if(fo1 != null){
      lb1 = fo1.m2();
}
    boolean lb2 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1, lb2, fb0, fb1, lb1);
}
    ld0 = fd0 - fd1;
    lb2 = ld0 > fd0;
    fb0 = fb1 || lb1;
    lb2 = fd1 > ld0;
if(fo0 != null){
      fb0 = fo0.m2(fb1, lb1, lb2, fb0);
}
    fd0 = fd1 + ld0;
    fb1 = fd0 < fd1;
    ld0 = fd0 + fd1;
if(fo1 != null){
      lb1 = fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(ld0, fd0, fd1, ld0);
}
    Output.points[7][1] += fd0;

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
